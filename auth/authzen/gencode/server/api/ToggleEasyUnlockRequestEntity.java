package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.abuj;
import defpackage.atqs;
import defpackage.atzr;
import defpackage.aulm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ToggleEasyUnlockRequestEntity extends FastSafeParcelableJsonResponse implements atqs {
    public static final Parcelable.Creator CREATOR = new abuj();
    private static final HashMap h;
    final Set a;
    boolean b;
    DeviceClassifierEntity c;
    boolean d;
    String e;
    boolean f;
    String g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("applyToAll", new FastJsonResponse$Field(6, false, 6, false, "applyToAll", 2, null));
        hashMap.put("deviceClassifier", new FastJsonResponse$Field(11, false, 11, false, "deviceClassifier", 3, DeviceClassifierEntity.class));
        hashMap.put("enable", new FastJsonResponse$Field(6, false, 6, false, "enable", 4, null));
        hashMap.put("feature", new FastJsonResponse$Field(7, false, 7, false, "feature", 5, null));
        hashMap.put("isExclusive", new FastJsonResponse$Field(6, false, 6, false, "isExclusive", 6, null));
        hashMap.put("publicKey", new FastJsonResponse$Field(7, false, 7, false, "publicKey", 7, null));
    }

    public ToggleEasyUnlockRequestEntity(Set set, boolean z, DeviceClassifierEntity deviceClassifierEntity, boolean z2, String str, boolean z3, String str2) {
        this.a = set;
        this.b = z;
        this.c = deviceClassifierEntity;
        this.d = z2;
        this.e = str;
        this.f = z3;
        this.g = str2;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                return Boolean.valueOf(this.b);
            case 3:
                return this.c;
            case 4:
                return Boolean.valueOf(this.d);
            case 5:
                return this.e;
            case 6:
                return Boolean.valueOf(this.f);
            case 7:
                return this.g;
            default:
                throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return h;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof ToggleEasyUnlockRequestEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ToggleEasyUnlockRequestEntity toggleEasyUnlockRequestEntity = (ToggleEasyUnlockRequestEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!toggleEasyUnlockRequestEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(toggleEasyUnlockRequestEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (toggleEasyUnlockRequestEntity.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            this.e = str2;
        } else {
            if (i != 7) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.g = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
        }
        this.c = (DeviceClassifierEntity) aulmVar;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = z;
        } else if (i == 4) {
            this.d = z;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.f = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
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
            atzr.t(parcel, 3, this.c, i, true);
        }
        if (set.contains(4)) {
            atzr.e(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            atzr.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            atzr.e(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            atzr.v(parcel, 7, this.g, true);
        }
        atzr.c(parcel, a);
    }

    public ToggleEasyUnlockRequestEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
