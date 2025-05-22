package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.czkk;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RecaptchaHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czkk();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.x(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
