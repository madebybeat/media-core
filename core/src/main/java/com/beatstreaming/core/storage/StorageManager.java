package com.beatstreaming.core.storage;

import android.content.Context;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import lombok.SneakyThrows;

public class StorageManager<T> {
    private final Class<? extends T> clazz;
    private final String name;

    private final Gson gson;

    public StorageManager(Class<? extends T> clazz, String name) {
        this.clazz = clazz;
        this.name = name;

        this.gson = new Gson();
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
            if (exception instanceof FileNotFoundException) {
                return this.clazz.newInstance();
            }

            throw new RuntimeException(exception);
        }
    }

    @SneakyThrows
    public void save(Context context, T object) {
        try (FileOutputStream fileOutputStream = context.openFileOutput(this.getName(), Context.MODE_PRIVATE)) {
            fileOutputStream.write(this.gson.toJson(object).getBytes());
        }
    }
}
