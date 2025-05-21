package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;
import defpackage.ahgt;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Snapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahgt();
    public final ActivityRecognitionResult a;
    public final BeaconStateImpl b;
    public final HeadphoneStateImpl c;
    public final Location d;
    public final NetworkStateImpl e;
    public final DataHolder f;
    public final PowerStateImpl g;
    public final ScreenStateImpl h;
    public final WeatherImpl i;
    public final TimeIntervalsImpl j;
    public final ContextData k;

    public Snapshot(ActivityRecognitionResult activityRecognitionResult, BeaconStateImpl beaconStateImpl, HeadphoneStateImpl headphoneStateImpl, Location location, NetworkStateImpl networkStateImpl, DataHolder dataHolder, PowerStateImpl powerStateImpl, ScreenStateImpl screenStateImpl, WeatherImpl weatherImpl, TimeIntervalsImpl timeIntervalsImpl, ContextData contextData) {
        this.a = activityRecognitionResult;
        this.b = beaconStateImpl;
        this.c = headphoneStateImpl;
        this.d = location;
        this.e = networkStateImpl;
        this.f = dataHolder;
        this.g = powerStateImpl;
        this.h = screenStateImpl;
        this.i = weatherImpl;
        this.j = timeIntervalsImpl;
        this.k = contextData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ActivityRecognitionResult activityRecognitionResult = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, activityRecognitionResult, i, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.t(parcel, 7, this.f, i, false);
        arxc.t(parcel, 8, this.g, i, false);
        arxc.t(parcel, 9, this.h, i, false);
        arxc.t(parcel, 10, this.i, i, false);
        arxc.t(parcel, 11, this.j, i, false);
        arxc.t(parcel, 12, this.k, i, false);
        arxc.c(parcel, a);
    }
}
