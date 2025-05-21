package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class x extends otn implements IInterface {
    private final a a;

    public x(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.a = aVar;
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
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
