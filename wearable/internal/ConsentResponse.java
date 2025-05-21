package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dkhy;
import j$.time.Instant;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkhy();
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
                if (arwb.b(this.g, consentResponse.g) && arwb.b(this.h, consentResponse.h)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.y(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.I(parcel, 8, this.h);
        arxc.c(parcel, a);
    }
}
