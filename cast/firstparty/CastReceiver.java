package com.google.android.gms.cast.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amuj;
import defpackage.amxr;
import defpackage.arxc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amuj();
    public final String a;
    public final String b;
    public final String c;
    private final List d;

    public CastReceiver(String str, List list, String str2, String str3) {
        this.a = str;
        this.d = list;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CastReceiver)) {
            return false;
        }
        CastReceiver castReceiver = (CastReceiver) obj;
        return amxr.u(this.a, castReceiver.a) && amxr.u(this.d, castReceiver.d) && amxr.u(this.b, castReceiver.b) && amxr.u(this.c, castReceiver.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.d, this.b, this.c});
    }

    public final String toString() {
        String str = this.a;
        Locale locale = Locale.ROOT;
        String str2 = this.b;
        String str3 = this.c;
        List list = this.d;
        return String.format(locale, "Device Cert: %s\n\tMessage: %s\n\tSignature: %s\n\t ICA:%s", str, str2, str3, list == null ? "NULL" : TextUtils.join(",", list));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.x(parcel, 3, new ArrayList(this.d), false);
        arxc.v(parcel, 4, this.b, false);
        arxc.v(parcel, 5, this.c, false);
        arxc.c(parcel, a);
    }
}
