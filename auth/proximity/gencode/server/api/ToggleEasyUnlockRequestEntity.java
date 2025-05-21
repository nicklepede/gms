package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.acow;
import defpackage.arod;
import defpackage.arxc;
import defpackage.ashs;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ToggleEasyUnlockRequestEntity extends FastSafeParcelableJsonResponse implements arod {
    public static final Parcelable.Creator CREATOR = new acow();
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

    @Override // defpackage.ashs
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

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return h;
    }

    @Override // defpackage.ashs
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

    @Override // defpackage.ashs
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

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
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

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(a.ag(i, ashsVar, " is not a known custom type.  Found "));
        }
        this.c = (DeviceClassifierEntity) ashsVar;
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
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.e(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.t(parcel, 3, this.c, i, true);
        }
        if (set.contains(4)) {
            arxc.e(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.e(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            arxc.v(parcel, 7, this.g, true);
        }
        arxc.c(parcel, a);
    }

    public ToggleEasyUnlockRequestEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
