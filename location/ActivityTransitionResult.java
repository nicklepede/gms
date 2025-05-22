package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.cbpz;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cbpz();
    public final List a;
    public Bundle b;

    public ActivityTransitionResult(List list, Bundle bundle) {
        this.b = null;
        atzb.t(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                int i2 = i - 1;
                atzb.d(((ActivityTransitionEvent) list.get(i)).c >= ((ActivityTransitionEvent) list.get(i2)).c, "Transition out of order: ts1=%d, ts2=%d", Long.valueOf(((ActivityTransitionEvent) list.get(i)).c), Long.valueOf(((ActivityTransitionEvent) list.get(i2)).c));
            }
        }
        this.a = DesugarCollections.unmodifiableList(list);
        this.b = bundle;
    }

    public static ActivityTransitionResult a(Intent intent) {
        if (b(intent)) {
            return (ActivityTransitionResult) atzs.b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public static boolean b(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ActivityTransitionResult) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        atzb.s(parcel);
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
