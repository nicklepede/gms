package com.google.android.gms.auth.uiflows.minutemaid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.afpd;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FolsomJsBridgeHelper$SetVaultSharedKeyTask extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afpd();
    public final String a;
    public final String b;

    public FolsomJsBridgeHelper$SetVaultSharedKeyTask(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
