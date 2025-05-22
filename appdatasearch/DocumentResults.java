package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vnd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DocumentResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vnd();
    public final String a;
    final Bundle b;
    final Bundle c;
    final Bundle d;

    public DocumentResults(String str, Bundle bundle, Bundle bundle2, Bundle bundle3) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.g(parcel, 3, this.c, false);
        atzr.g(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public DocumentResults(String str) {
        this(str, null, null, null);
    }
}
