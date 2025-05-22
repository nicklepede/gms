package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.Activity;
import com.google.android.gms.semanticlocation.PeriodSummary;
import com.google.android.gms.semanticlocation.TimelineMemory;
import com.google.android.gms.semanticlocation.TimelinePath;
import com.google.android.gms.semanticlocation.Visit;
import defpackage.dcmu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LocationHistorySegment extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcmu();
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final Visit g;
    public final Activity h;
    public final TimelinePath i;
    public final int j;
    public final int k;
    public final TimelineMemory l;
    public final PeriodSummary m;

    public LocationHistorySegment(long j, long j2, int i, int i2, String str, int i3, Visit visit, Activity activity, TimelinePath timelinePath, int i4, int i5, TimelineMemory timelineMemory, PeriodSummary periodSummary) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = i3;
        this.g = visit;
        this.h = activity;
        this.i = timelinePath;
        this.j = i4;
        this.k = i5;
        this.l = timelineMemory;
        this.m = periodSummary;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dcmu.a(this, parcel, i);
    }
}
