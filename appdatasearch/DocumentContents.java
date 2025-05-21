package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.trb;
import defpackage.tro;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trb();
    public final DocumentSection[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.a = documentSectionArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            if (arwb.b(this.b, documentContents.b) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(documentContents.c)) && arwb.b(this.d, documentContents.d) && Arrays.equals(this.a, documentContents.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentContents(Account account, DocumentSection... documentSectionArr) {
        this(documentSectionArr, null, false, account);
        if (documentSectionArr != null) {
            int i = tro.b;
            BitSet bitSet = new BitSet(10);
            for (DocumentSection documentSection : documentSectionArr) {
                int i2 = documentSection.e;
                if (i2 != -1) {
                    if (bitSet.get(i2)) {
                        throw new IllegalArgumentException("Duplicate global search section type ".concat(String.valueOf(tro.b(i2))));
                    }
                    bitSet.set(i2);
                }
            }
        }
    }
}
