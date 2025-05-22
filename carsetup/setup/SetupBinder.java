package com.google.android.gms.carsetup.setup;

import android.content.Intent;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.anyr;
import defpackage.anys;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SetupBinder extends Binder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new anyr();
    public Intent a;
    private boolean b = false;
    private anys c;

    public SetupBinder(Intent intent, anys anysVar) {
        this.c = anysVar;
        this.a = intent;
    }

    public void a() {
        this.b = false;
    }

    public boolean b() {
        return this.b;
    }

    public final anys c() {
        anys anysVar = this.c;
        this.c = null;
        return anysVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this);
    }

    public SetupBinder() {
    }
}
