package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.bgmd;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataStatsResult extends AbstractSafeParcelable implements Closeable, aqyf {
    public static final Parcelable.Creator CREATOR = new bgmd();
    public final Status a;
    public final List b;
    public final long c;
    public final String d;
    public final long e;
    public final DataHolder f;

    public DataStatsResult(Status status, List list, long j, String str, long j2, DataHolder dataHolder) {
        this.a = status;
        this.b = list;
        this.c = j;
        this.d = str == null ? "" : str;
        this.e = j2;
        this.f = dataHolder;
    }

    public static DataStatsResult b(Status status) {
        return new DataStatsResult(status, Collections.EMPTY_LIST, -1L, "", 0L, null);
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        DataHolder dataHolder = this.f;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "DataStatsResult{%s %d sources}", this.a, Integer.valueOf(this.b.size()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, status, i, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.q(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }
}
