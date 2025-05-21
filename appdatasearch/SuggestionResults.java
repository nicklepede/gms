package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.tsu;
import defpackage.tsv;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SuggestionResults extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new tsv();
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
        return new tsu(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.w(parcel, 2, this.b, false);
        arxc.w(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public SuggestionResults(String str) {
        this(str, null, null);
    }
}
