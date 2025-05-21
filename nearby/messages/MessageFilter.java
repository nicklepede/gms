package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.ble.BleFilter;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cjzi;
import defpackage.cjzj;
import defpackage.ckbw;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MessageFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjzj();
    public static final MessageFilter a;
    final int b;
    public final List c;
    public final List d;
    public final boolean e;
    public final List f;
    public final int g;

    static {
        cjzi cjziVar = new cjzi();
        cjziVar.a = true;
        a = cjziVar.a();
    }

    public MessageFilter(int i, List list, List list2, boolean z, List list3, int i2) {
        this.b = i;
        arwm.s(list);
        this.c = DesugarCollections.unmodifiableList(list);
        this.e = z;
        this.d = DesugarCollections.unmodifiableList(list2 == null ? Collections.EMPTY_LIST : list2);
        this.f = DesugarCollections.unmodifiableList(list3 == null ? Collections.EMPTY_LIST : list3);
        this.g = i2;
    }

    public final boolean a() {
        return this.g > 0;
    }

    public final boolean b() {
        if (this.e) {
            return true;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (!"__reserved_namespace".equals(((MessageType) it.next()).b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Message message) {
        if (message == null || ((!this.e || message.c()) && !this.c.contains(new MessageType(message.d, message.c)))) {
            return false;
        }
        if (!message.c()) {
            return true;
        }
        for (NearbyDeviceFilter nearbyDeviceFilter : this.d) {
            if (nearbyDeviceFilter.b == (message.d("__eddystone_uid") ? 2 : message.d("__i_beacon_id") ? 3 : 1)) {
                byte[] bArr = nearbyDeviceFilter.c;
                byte[] bArr2 = message.b;
                if (bArr2 != null && bArr != null) {
                    if (bArr2.length >= bArr.length) {
                        for (int i = 0; i < bArr.length; i++) {
                            if (bArr[i] == bArr2[i]) {
                            }
                        }
                        return true;
                    }
                }
            }
            if (message.d("__eddystone_url") && nearbyDeviceFilter.d) {
                return true;
            }
        }
        for (BleFilter bleFilter : this.f) {
            if ("__reserved_namespace".equals(message.d)) {
                String str = message.c;
                if ("__ble_record".equals(str)) {
                    int i2 = ckbw.d;
                    arwm.c(message.d("__ble_record"), "Message type '" + str + "' is not Message.MESSAGE_TYPE_BLE_RECORD.");
                    ckbw a2 = ckbw.a(message.b);
                    if (a2 == null) {
                        continue;
                    } else {
                        ParcelUuid parcelUuid = bleFilter.b;
                        if (parcelUuid != null) {
                            ParcelUuid parcelUuid2 = bleFilter.c;
                            List<ParcelUuid> list = a2.a;
                            if (list == null) {
                                continue;
                            } else {
                                UUID uuid = parcelUuid2 == null ? null : parcelUuid2.getUuid();
                                for (ParcelUuid parcelUuid3 : list) {
                                    UUID uuid2 = parcelUuid.getUuid();
                                    UUID uuid3 = parcelUuid3.getUuid();
                                    if (uuid == null) {
                                        if (uuid2.equals(uuid3)) {
                                        }
                                    } else if ((uuid2.getLeastSignificantBits() & uuid.getLeastSignificantBits()) == (uuid3.getLeastSignificantBits() & uuid.getLeastSignificantBits()) && (uuid2.getMostSignificantBits() & uuid.getMostSignificantBits()) == (uuid3.getMostSignificantBits() & uuid.getMostSignificantBits())) {
                                    }
                                }
                            }
                        }
                        ParcelUuid parcelUuid4 = bleFilter.d;
                        if (parcelUuid4 == null || BleFilter.a(bleFilter.e, bleFilter.f, (byte[]) a2.b.get(parcelUuid4))) {
                            int i3 = bleFilter.g;
                            if (i3 < 0 || BleFilter.a(bleFilter.h, bleFilter.i, a2.b(i3))) {
                                return true;
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        return this.e == messageFilter.e && arwb.b(this.c, messageFilter.c) && arwb.b(this.d, messageFilter.d) && arwb.b(this.f, messageFilter.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, Boolean.valueOf(this.e), this.f});
    }

    public final String toString() {
        return "MessageFilter{includeAllMyTypes=" + this.e + ", messageTypes=" + String.valueOf(this.c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.c;
        int a2 = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.y(parcel, 2, this.d, false);
        arxc.e(parcel, 3, this.e);
        arxc.y(parcel, 4, this.f, false);
        arxc.o(parcel, 5, this.g);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.b);
        arxc.c(parcel, a2);
    }
}
