package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cxam;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecaptchaHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxam();
    public final String a;
    public final String b;
    public final List c;

    public RecaptchaHandle(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.x(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
