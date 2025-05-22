package com.google.android.gms.quickstart;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.czhu;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class XosLaunchParameters extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new czhu();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, uri, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
