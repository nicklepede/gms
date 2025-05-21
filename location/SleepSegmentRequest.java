package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.bzjb;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzjb();
    public final List a;
    public final int b;

    public SleepSegmentRequest(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public static SleepSegmentRequest a(Intent intent) {
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST")) {
            return (SleepSegmentRequest) arxd.b(intent, "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST", CREATOR);
        }
        return null;
    }

    public final boolean b() {
        int i = this.b;
        return i == 0 || i == 2;
    }

    public final boolean c() {
        int i = this.b;
        return i == 0 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return arwb.b(this.a, sleepSegmentRequest.a) && this.b == sleepSegmentRequest.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        arwm.s(parcel);
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
