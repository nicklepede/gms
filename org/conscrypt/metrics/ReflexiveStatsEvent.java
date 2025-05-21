package com.google.android.gms.org.conscrypt.metrics;

import com.google.android.gms.org.conscrypt.Platform;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ReflexiveStatsEvent {
    private static final Class c_statsEvent;
    private static final OptionalMethod newBuilder;
    private static final boolean sdkVersionBiggerThan32;
    private final Object statsEvent;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Builder {
        private static final OptionalMethod build;
        private static final Class c_statsEvent_Builder;
        private static final OptionalMethod setAtomId;
        private static final OptionalMethod usePooledBuffer;
        private static final OptionalMethod writeBoolean;
        private static final OptionalMethod writeInt;
        private static final OptionalMethod writeIntArray;
        private final Object builder;

        static {
            Class initStatsEventBuilderClass = initStatsEventBuilderClass();
            c_statsEvent_Builder = initStatsEventBuilderClass;
            setAtomId = new OptionalMethod(initStatsEventBuilderClass, "setAtomId", Integer.TYPE);
            writeBoolean = new OptionalMethod(initStatsEventBuilderClass, "writeBoolean", Boolean.TYPE);
            writeInt = new OptionalMethod(initStatsEventBuilderClass, "writeInt", Integer.TYPE);
            build = new OptionalMethod(initStatsEventBuilderClass, "build", new Class[0]);
            usePooledBuffer = new OptionalMethod(initStatsEventBuilderClass, "usePooledBuffer", new Class[0]);
            writeIntArray = new OptionalMethod(initStatsEventBuilderClass, "writeIntArray", int[].class);
        }

        private static Class initStatsEventBuilderClass() {
            try {
                return Class.forName("android.util.StatsEvent$Builder");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public ReflexiveStatsEvent build() {
            return new ReflexiveStatsEvent(build.invoke(this.builder, new Object[0]));
        }

        public Builder setAtomId(int i) {
            setAtomId.invoke(this.builder, Integer.valueOf(i));
            return this;
        }

        public void usePooledBuffer() {
            usePooledBuffer.invoke(this.builder, new Object[0]);
        }

        public Builder writeBoolean(boolean z) {
            writeBoolean.invoke(this.builder, Boolean.valueOf(z));
            return this;
        }

        public Builder writeInt(int i) {
            writeInt.invoke(this.builder, Integer.valueOf(i));
            return this;
        }

        public Builder writeIntArray(int[] iArr) {
            if (ReflexiveStatsEvent.sdkVersionBiggerThan32) {
                writeIntArray.invoke(this.builder, iArr);
            }
            return this;
        }

        private Builder() {
            this.builder = ReflexiveStatsEvent.newBuilder.invokeStatic(new Object[0]);
        }
    }

    static {
        Class initStatsEventClass = initStatsEventClass();
        c_statsEvent = initStatsEventClass;
        newBuilder = new OptionalMethod(initStatsEventClass, "newBuilder", new Class[0]);
        sdkVersionBiggerThan32 = Platform.isSdkGreater(32);
    }

    private ReflexiveStatsEvent(Object obj) {
        this.statsEvent = obj;
    }

    @Deprecated
    public static ReflexiveStatsEvent buildEvent(int i, boolean z, int i2, int i3, int i4, int i5) {
        Builder newBuilder2 = newBuilder();
        newBuilder2.setAtomId(i);
        newBuilder2.writeBoolean(z);
        newBuilder2.writeInt(i2);
        newBuilder2.writeInt(i3);
        newBuilder2.writeInt(i4);
        newBuilder2.writeInt(i5);
        newBuilder2.usePooledBuffer();
        return newBuilder2.build();
    }

    private static Class initStatsEventClass() {
        try {
            return Class.forName("android.util.StatsEvent");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Object getStatsEvent() {
        return this.statsEvent;
    }

    @Deprecated
    public static ReflexiveStatsEvent buildEvent(int i, boolean z, int i2, int i3, int i4, int i5, int[] iArr) {
        Builder newBuilder2 = newBuilder();
        newBuilder2.setAtomId(i);
        newBuilder2.writeBoolean(z);
        newBuilder2.writeInt(i2);
        newBuilder2.writeInt(i3);
        newBuilder2.writeInt(i4);
        newBuilder2.writeInt(i5);
        newBuilder2.writeIntArray(iArr);
        newBuilder2.usePooledBuffer();
        return newBuilder2.build();
    }
}
