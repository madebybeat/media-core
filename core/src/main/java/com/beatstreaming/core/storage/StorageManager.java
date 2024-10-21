package com.beatstreaming.core.storage;

import android.content.Context;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import lombok.SneakyThrows;

public class StorageManager<T> {
    private final Gson gson;
    private final Class<? extends T> clazz;
    private final String name;

    public StorageManager(Gson gson, Class<? extends T> clazz, String name) {
        this.gson = gson;
        this.clazz = clazz;
        this.name = name;
    }

    private String getName() {
        return this.name + ".json";
    }

    @SneakyThrows
    public T load(Context context) {
        StringBuilder stringBuilder = new StringBuilder();

        try (FileInputStream fileInputStream = context.openFileInput(this.getName())) {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

            return this.gson.fromJson(stringBuilder.toString(), this.clazz);
        } catch (Exception exception) {
            exception.printStackTrace();

            return this.clazz.newInstance();
        }
    }

    @SneakyThrows
    public void save(Context context, T object) {
        try (FileOutputStream fileOutputStream = context.openFileOutput(this.getName(), Context.MODE_PRIVATE)) {
            fileOutputStream.write(this.gson.toJson(object).getBytes());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
