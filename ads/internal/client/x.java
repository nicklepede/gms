package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class x extends qmq implements IInterface {
    private final a a;

    public x(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.a = aVar;
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        this.a.a();
        parcel2.writeNoException();
        return true;
    }

    public x() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }
}
