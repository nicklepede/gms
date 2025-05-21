package com.google.android.gms.car.senderprotocol;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aldv;
import defpackage.alfd;
import defpackage.alga;
import defpackage.eiig;
import defpackage.ejhh;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ChannelMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aldv();
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public long j = 0;

    public ChannelMessage(int i, ByteBuffer byteBuffer, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4) {
        this.b = i;
        this.c = byteBuffer;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = i3;
        this.d = i2;
        this.a = i4;
    }

    public final void a(long j) {
        eiig.p(j > 0);
        this.j = j;
    }

    public final boolean b() {
        return this.j != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        ejhh ejhhVar = alga.a;
        parcel.writeStrongBinder(new alfd(this.c));
        parcel.writeInt(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.a);
    }
}
