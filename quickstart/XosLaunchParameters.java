package com.google.android.gms.quickstart;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cwxw;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class XosLaunchParameters extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cwxw();
    public final Uri a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public XosLaunchParameters(Uri uri, int i, int i2, String str, String str2) {
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "OsmosisParameters[version=%d, flowType=%d, sessionId=%s, authKey=%s]", Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, uri, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
