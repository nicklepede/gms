package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aczg;
import defpackage.adau;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PasswordCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aczg();
    String a;
    String b;
    String c;

    public PasswordCheckResponse(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }

    public PasswordCheckResponse(adau adauVar) {
        this(adauVar, (String) null, (String) null);
    }

    public PasswordCheckResponse(adau adauVar, String str, String str2) {
        atzb.s(adauVar);
        this.a = adauVar.ak;
        this.b = str;
        this.c = str2;
    }
}
