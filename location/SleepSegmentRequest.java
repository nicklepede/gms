package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.cbrs;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cbrs();
    public final List a;
    public final int b;

    public SleepSegmentRequest(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public static SleepSegmentRequest a(Intent intent) {
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST")) {
            return (SleepSegmentRequest) atzs.b(intent, "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST", CREATOR);
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
        return atyq.b(this.a, sleepSegmentRequest.a) && this.b == sleepSegmentRequest.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        atzb.s(parcel);
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
