package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.vmx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CorpusId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vmx();
    public final String a;
    public final String b;
    final Bundle c;

    public CorpusId(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusId) {
            CorpusId corpusId = (CorpusId) obj;
            if (atyq.b(this.a, corpusId.a) && atyq.b(this.b, corpusId.b) && atyq.b(this.c, corpusId.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        Bundle bundle = this.c;
        String bundle2 = bundle != null ? bundle.toString() : "null";
        String str = this.b;
        return "CorpusId[package=" + this.a + ", corpus=" + str + ", userHandle=" + bundle2 + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.g(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public CorpusId(String str, String str2) {
        this(str, str2, null);
    }
}
