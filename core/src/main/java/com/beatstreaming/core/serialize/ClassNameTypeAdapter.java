package com.beatstreaming.core.serialize;

import com.google.gson.*;
import java.lang.reflect.Type;

public class ClassNameTypeAdapter implements JsonSerializer<Class<?>>, JsonDeserializer<Class<?>> {
    @Override
    public JsonElement serialize(Class<?> clazz, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(clazz.getName());
    }

    @Override
    public Class<?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            return Class.forName(json.getAsString());
        } catch (ClassNotFoundException exception) {
            throw new JsonParseException(exception);
        }
    }
}
