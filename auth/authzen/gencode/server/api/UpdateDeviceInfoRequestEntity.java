package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.abuk;
import defpackage.atqs;
import defpackage.atzr;
import defpackage.aulm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class UpdateDeviceInfoRequestEntity extends FastSafeParcelableJsonResponse implements atqs {
    public static final Parcelable.Creator CREATOR = new abuk();
    private static final HashMap g;
    final Set a;
    DeviceClassifierEntity b;
    String c;
    int d;
    String e;
    int f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("deviceClassifier", new FastJsonResponse$Field(11, false, 11, false, "deviceClassifier", 2, DeviceClassifierEntity.class));
        hashMap.put("deviceInfoUpdate", new FastJsonResponse$Field(7, false, 7, false, "deviceInfoUpdate", 3, null));
        hashMap.put("invocationReason", new FastJsonResponse$Field(0, false, 0, false, "invocationReason", 4, null));
        hashMap.put("protocolType", new FastJsonResponse$Field(7, false, 7, false, "protocolType", 5, null));
        hashMap.put("retryCount", new FastJsonResponse$Field(0, false, 0, false, "retryCount", 6, null));
    }

    public UpdateDeviceInfoRequestEntity(Set set, DeviceClassifierEntity deviceClassifierEntity, String str, int i, String str2, int i2) {
        this.a = set;
        this.b = deviceClassifierEntity;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = i2;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return Integer.valueOf(this.d);
        }
        if (i == 5) {
            return this.e;
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
        if (!(obj instanceof UpdateDeviceInfoRequestEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        UpdateDeviceInfoRequestEntity updateDeviceInfoRequestEntity = (UpdateDeviceInfoRequestEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!updateDeviceInfoRequestEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(updateDeviceInfoRequestEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (updateDeviceInfoRequestEntity.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = str2;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.e = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
        }
        this.b = (DeviceClassifierEntity) aulmVar;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 4) {
            this.d = i;
        } else {
            if (i2 != 6) {
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
            }
            this.f = i;
        }
        this.a.add(Integer.valueOf(i2));
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
            atzr.t(parcel, 2, this.b, i, true);
        }
        if (set.contains(3)) {
            atzr.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            atzr.o(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            atzr.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            atzr.o(parcel, 6, this.f);
        }
        atzr.c(parcel, a);
    }

    public UpdateDeviceInfoRequestEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
