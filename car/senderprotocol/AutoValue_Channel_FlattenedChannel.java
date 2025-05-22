package com.google.android.gms.car.senderprotocol;

import defpackage.aniy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutoValue_Channel_FlattenedChannel extends Channel$FlattenedChannel {
    private final int a;
    private final int b;
    private final int c;
    private final aniy d;

    public AutoValue_Channel_FlattenedChannel(int i, int i2, int i3, aniy aniyVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (aniyVar == null) {
            throw new NullPointerException("Null qoSPriority");
        }
        this.d = aniyVar;
    }

    @Override // com.google.android.gms.car.senderprotocol.Channel$FlattenedChannel
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.car.senderprotocol.Channel$FlattenedChannel
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.gms.car.senderprotocol.Channel$FlattenedChannel
    public final int c() {
        return this.c;
    }

    @Override // com.google.android.gms.car.senderprotocol.Channel$FlattenedChannel
    public final aniy d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Channel$FlattenedChannel) {
            Channel$FlattenedChannel channel$FlattenedChannel = (Channel$FlattenedChannel) obj;
            if (this.a == channel$FlattenedChannel.a() && this.b == channel$FlattenedChannel.b() && this.c == channel$FlattenedChannel.c() && this.d.equals(channel$FlattenedChannel.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "FlattenedChannel{channelNumber=" + this.a + ", channelPriority=" + this.b + ", channelState=" + this.c + ", qoSPriority=" + this.d.toString() + "}";
    }
}
