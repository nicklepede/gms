package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;
import defpackage.ajhj;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class Snapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajhj();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, activityRecognitionResult, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.t(parcel, 7, this.f, i, false);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.t(parcel, 11, this.j, i, false);
        atzr.t(parcel, 12, this.k, i, false);
        atzr.c(parcel, a);
    }
}
