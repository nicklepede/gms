package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cebo;
import defpackage.ffgs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ConsentStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cebo();
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

    public final ffgs a() {
        ffgs b = ffgs.b(this.a);
        return b != null ? b : ffgs.CONSENT_UNSPECIFIED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentStatus) {
            return arwb.b(Integer.valueOf(this.a), Integer.valueOf(((ConsentStatus) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("EnumVal", Integer.valueOf(this.a), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.c(parcel, a);
    }

    public ConsentStatus(int i) {
        if (!b(i)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", Integer.valueOf(i)));
        }
        this.a = i;
    }
}
