package com.google.android.gms.carsetup.setup;

import android.content.Intent;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alxg;
import defpackage.alxh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SetupBinder extends Binder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alxg();
    public Intent a;
    private boolean b = false;
    private alxh c;

    public SetupBinder(Intent intent, alxh alxhVar) {
        this.c = alxhVar;
        this.a = intent;
    }

    public void a() {
        this.b = false;
    }

    public boolean b() {
        return this.b;
    }

    public final alxh c() {
        alxh alxhVar = this.c;
        this.c = null;
        return alxhVar;
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
