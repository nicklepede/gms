package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.cbpx;
import defpackage.cbpy;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cbpy();
    public static final Comparator a = new cbpx();
    public final List b;
    public final String c;
    public final List d;
    public String e;

    public ActivityTransitionRequest(List list) {
        this(list, null, null);
    }

    public static ActivityTransitionRequest a(Intent intent) {
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST")) {
            return (ActivityTransitionRequest) atzs.b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST", CREATOR);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (atyq.b(this.b, activityTransitionRequest.b) && atyq.b(this.c, activityTransitionRequest.c) && atyq.b(this.e, activityTransitionRequest.e) && atyq.b(this.d, activityTransitionRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        List list = this.d;
        return "ActivityTransitionRequest [mTransitions=" + String.valueOf(this.b) + ", mTag='" + this.c + "', mClients=" + String.valueOf(list) + ", mAttributionTag=" + this.e + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        atzb.s(parcel);
        List list = this.b;
        int a2 = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.y(parcel, 3, this.d, false);
        atzr.v(parcel, 4, this.e, false);
        atzr.c(parcel, a2);
    }

    public ActivityTransitionRequest(List list, String str, List list2) {
        this(list, str, list2, null);
    }

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        List unmodifiableList;
        atzb.t(list, "transitions can't be null");
        atzb.c(!list.isEmpty(), "transitions can't be empty.");
        atzb.s(list);
        TreeSet treeSet = new TreeSet(a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            atzb.c(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = str;
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = str2;
    }
}
