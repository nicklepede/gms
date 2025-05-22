package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.vnb;
import defpackage.vno;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vnb();
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
            if (atyq.b(this.b, documentContents.b) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(documentContents.c)) && atyq.b(this.d, documentContents.d) && Arrays.equals(this.a, documentContents.a)) {
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
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentContents(Account account, DocumentSection... documentSectionArr) {
        this(documentSectionArr, null, false, account);
        if (documentSectionArr != null) {
            int i = vno.b;
            BitSet bitSet = new BitSet(10);
            for (DocumentSection documentSection : documentSectionArr) {
                int i2 = documentSection.e;
                if (i2 != -1) {
                    if (bitSet.get(i2)) {
                        throw new IllegalArgumentException("Duplicate global search section type ".concat(String.valueOf(vno.b(i2))));
                    }
                    bitSet.set(i2);
                }
            }
        }
    }
}
