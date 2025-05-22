package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgkv;
import defpackage.fhvq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ConsentStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgkv();
    public int a;

    public ConsentStatus() {
    }

    public static boolean b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public final fhvq a() {
        fhvq b = fhvq.b(this.a);
        return b != null ? b : fhvq.CONSENT_UNSPECIFIED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentStatus) {
            return atyq.b(Integer.valueOf(this.a), Integer.valueOf(((ConsentStatus) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("EnumVal", Integer.valueOf(this.a), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.c(parcel, a);
    }

    public ConsentStatus(int i) {
        if (!b(i)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", Integer.valueOf(i)));
        }
        this.a = i;
    }
}
