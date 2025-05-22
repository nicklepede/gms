package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vou;
import defpackage.vov;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SuggestionResults extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new vov();
    final String a;
    public final String[] b;
    final String[] c;

    public SuggestionResults(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.a != null) {
            return null;
        }
        return new vou(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.w(parcel, 2, this.b, false);
        atzr.w(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public SuggestionResults(String str) {
        this(str, null, null);
    }
}
