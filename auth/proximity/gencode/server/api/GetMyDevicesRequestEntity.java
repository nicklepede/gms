package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.aeou;
import defpackage.atqs;
import defpackage.atzr;
import defpackage.aulm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GetMyDevicesRequestEntity extends FastSafeParcelableJsonResponse implements atqs {
    public static final Parcelable.Creator CREATOR = new aeou();
    private static final HashMap g;
    final Set a;
    boolean b;
    boolean c;
    DeviceClassifierEntity d;
    int e;
    int f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("allowStaleRead", new FastJsonResponse$Field(6, false, 6, false, "allowStaleRead", 2, null));
        hashMap.put("approvedForUnlockRequired", new FastJsonResponse$Field(6, false, 6, false, "approvedForUnlockRequired", 3, null));
        hashMap.put("deviceClassifier", new FastJsonResponse$Field(11, false, 11, false, "deviceClassifier", 4, DeviceClassifierEntity.class));
        hashMap.put("invocationReason", new FastJsonResponse$Field(0, false, 0, false, "invocationReason", 5, null));
        hashMap.put("retryCount", new FastJsonResponse$Field(0, false, 0, false, "retryCount", 6, null));
    }

    public GetMyDevicesRequestEntity(Set set, boolean z, boolean z2, DeviceClassifierEntity deviceClassifierEntity, int i, int i2) {
        this.a = set;
        this.b = z;
        this.c = z2;
        this.d = deviceClassifierEntity;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Boolean.valueOf(this.b);
        }
        if (i == 3) {
            return Boolean.valueOf(this.c);
        }
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return Integer.valueOf(this.e);
        }
        if (i == 6) {
            return Integer.valueOf(this.f);
        }
        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return g;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof GetMyDevicesRequestEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GetMyDevicesRequestEntity getMyDevicesRequestEntity = (GetMyDevicesRequestEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!getMyDevicesRequestEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(getMyDevicesRequestEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (getMyDevicesRequestEntity.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 4) {
            throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
        }
        this.d = (DeviceClassifierEntity) aulmVar;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 5) {
            this.e = i;
        } else {
            if (i2 != 6) {
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
            }
            this.f = i;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = z;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.c = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
            if (e(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.e(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            atzr.e(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            atzr.t(parcel, 4, this.d, i, true);
        }
        if (set.contains(5)) {
            atzr.o(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            atzr.o(parcel, 6, this.f);
        }
        atzr.c(parcel, a);
    }

    public GetMyDevicesRequestEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
