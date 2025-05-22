package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dmtr;
import j$.time.Instant;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmtr();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;
    public final Long h;

    public ConsentResponse(int i, boolean z, boolean z2, boolean z3, boolean z4, List list, String str, Long l) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = list;
        this.g = str;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentResponse)) {
            return false;
        }
        ConsentResponse consentResponse = (ConsentResponse) obj;
        if (this.a == consentResponse.a && this.b == consentResponse.b && this.c == consentResponse.c && this.d == consentResponse.d && this.e == consentResponse.e) {
            List list = consentResponse.f;
            List list2 = this.f;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || list2.size() != list.size())) {
                if (atyq.b(this.g, consentResponse.g) && atyq.b(this.h, consentResponse.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        Long l = this.h;
        String valueOf = String.valueOf(this.f);
        Instant ofEpochMilli = l != null ? Instant.ofEpochMilli(l.longValue()) : null;
        String str = this.g;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.b;
        return "ConsentResponse {statusCode =" + this.a + ", hasTosConsent =" + z4 + ", hasLoggingConsent =" + z3 + ", hasCloudSyncConsent =" + z2 + ", hasLocationConsent =" + z + ", accountConsentRecords =" + valueOf + ", nodeId =" + str + ", lastUpdateRequestedTime =" + String.valueOf(ofEpochMilli) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.y(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.I(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
