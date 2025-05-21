package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.acog;
import defpackage.arwm;
import defpackage.arxc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SyncedDevicesUpdateSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new acog();
    public final PendingIntent a;
    public final DeviceFilter b;
    public final String c;
    public final int d;

    public SyncedDevicesUpdateSubscription(PendingIntent pendingIntent, DeviceFilter deviceFilter, String str, int i) {
        arwm.s(pendingIntent);
        this.a = pendingIntent;
        arwm.s(deviceFilter);
        this.b = deviceFilter;
        arwm.s(str);
        this.c = str;
        this.d = i;
    }

    public static int c(List list, DeviceFilter deviceFilter) {
        arwm.s(deviceFilter);
        if (list.isEmpty()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SyncedCryptauthDevice syncedCryptauthDevice = (SyncedCryptauthDevice) it.next();
            Boolean bool = deviceFilter.a;
            if (bool == null || bool.booleanValue() == syncedCryptauthDevice.e) {
                Boolean bool2 = deviceFilter.c;
                if (bool2 == null || bool2.booleanValue() == syncedCryptauthDevice.h) {
                    Boolean bool3 = deviceFilter.b;
                    if (bool3 == null || bool3.booleanValue() == syncedCryptauthDevice.f) {
                        List list2 = deviceFilter.d;
                        if (list2.isEmpty() || list2.contains(syncedCryptauthDevice.i)) {
                            Boolean bool4 = deviceFilter.e;
                            if (bool4 == null || bool4.booleanValue() == syncedCryptauthDevice.j) {
                                Boolean bool5 = deviceFilter.f;
                                if (bool5 == null || bool5.booleanValue() == syncedCryptauthDevice.k) {
                                    if (syncedCryptauthDevice.l.containsAll(deviceFilter.g) && syncedCryptauthDevice.m.containsAll(deviceFilter.h)) {
                                        arrayList.add(Base64.encodeToString(syncedCryptauthDevice.a, 8));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return arrayList.hashCode();
    }

    @Override // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncedDevicesUpdateSubscription syncedDevicesUpdateSubscription = (SyncedDevicesUpdateSubscription) obj;
            if (this.a.equals(syncedDevicesUpdateSubscription.a) && this.b.equals(syncedDevicesUpdateSubscription.b) && this.c.equals(syncedDevicesUpdateSubscription.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return String.format("SyncedDevicesUpdateSubscription{mCallbackIntent=%s, mDeviceFilter=%s, mPackageName='%s', mLastMatchToken=%d}", this.a, this.b, this.c, Integer.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, pendingIntent, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
