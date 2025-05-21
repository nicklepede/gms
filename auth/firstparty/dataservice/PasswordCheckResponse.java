package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazg;
import defpackage.abau;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PasswordCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazg();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }

    public PasswordCheckResponse(abau abauVar) {
        this(abauVar, (String) null, (String) null);
    }

    public PasswordCheckResponse(abau abauVar, String str, String str2) {
        arwm.s(abauVar);
        this.a = abauVar.ak;
        this.b = str;
        this.c = str2;
    }
}
