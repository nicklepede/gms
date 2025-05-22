package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adak;
import defpackage.adau;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CaptchaChallenge extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adak();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.c(parcel, a);
    }

    public CaptchaChallenge(adau adauVar, String str, Bitmap bitmap) {
        atzb.s(adauVar);
        this.a = adauVar.ak;
        this.b = str;
        this.c = bitmap;
    }
}
