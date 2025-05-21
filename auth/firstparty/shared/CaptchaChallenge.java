package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abak;
import defpackage.abau;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CaptchaChallenge extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abak();
    final String a;
    final String b;
    final Bitmap c;

    public CaptchaChallenge(String str, String str2, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = bitmap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.c(parcel, a);
    }

    public CaptchaChallenge(abau abauVar, String str, Bitmap bitmap) {
        arwm.s(abauVar);
        this.a = abauVar.ak;
        this.b = str;
        this.c = bitmap;
    }
}
