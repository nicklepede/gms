package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czgx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czgx();
    public final long a;

    @Deprecated
    public final String b;
    public final int c;
    public final PlaceEnterEvent d;
    public final PlaceExitEvent e;
    public final PlaceOngoingEvent f;
    public final ActivityStartEvent g;
    public final ActivityEndEvent h;
    public final ActivityOngoingEvent i;

    public SemanticLocationEvent(long j, String str, int i, PlaceEnterEvent placeEnterEvent, PlaceExitEvent placeExitEvent, PlaceOngoingEvent placeOngoingEvent, ActivityStartEvent activityStartEvent, ActivityEndEvent activityEndEvent, ActivityOngoingEvent activityOngoingEvent) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = placeEnterEvent;
        this.e = placeExitEvent;
        this.f = placeOngoingEvent;
        this.g = activityStartEvent;
        this.h = activityEndEvent;
        this.i = activityOngoingEvent;
    }

    public final String toString() {
        ActivityOngoingEvent activityOngoingEvent = this.i;
        ActivityEndEvent activityEndEvent = this.h;
        ActivityStartEvent activityStartEvent = this.g;
        PlaceOngoingEvent placeOngoingEvent = this.f;
        PlaceExitEvent placeExitEvent = this.e;
        return "SemanticLocationEvent{time=" + this.a + ", eventType=" + this.c + ", placeEnterEvent=" + String.valueOf(this.d) + ", placeExitEvent=" + String.valueOf(placeExitEvent) + ", placeOngoingEvent=" + String.valueOf(placeOngoingEvent) + ", activityStartEvent=" + String.valueOf(activityStartEvent) + ", activityEndEvent=" + String.valueOf(activityEndEvent) + ", activityOngoingEvent=" + String.valueOf(activityOngoingEvent) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.c(parcel, a);
    }
}
