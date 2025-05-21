package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.dedf;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ScreenlockState extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dedf();
    private static final HashMap g;
    final Set a;
    public boolean b;
    public int c;
    public long d;
    public long e;
    public boolean f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("isSecureScreenlock", new FastJsonResponse$Field(6, false, 6, false, "isSecureScreenlock", 2, null));
        hashMap.put("screenlockType", new FastJsonResponse$Field(0, false, 0, false, "screenlockType", 3, null));
        hashMap.put("screenlockSettingsAgeMillis", new FastJsonResponse$Field(2, false, 2, false, "screenlockSettingsAgeMillis", 4, null));
        hashMap.put("elapsedTimeSinceUnlockMillis", new FastJsonResponse$Field(2, false, 2, false, "elapsedTimeSinceUnlockMillis", 5, null));
        hashMap.put("isForcedScreenlock", new FastJsonResponse$Field(6, false, 6, false, "isForcedScreenlock", 6, null));
    }

    public ScreenlockState(Set set, boolean z, int i, long j, long j2, boolean z2) {
        this.a = set;
        this.b = z;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = z2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Boolean.valueOf(this.b);
        }
        if (i == 3) {
            return Integer.valueOf(this.c);
        }
        if (i == 4) {
            return Long.valueOf(this.d);
        }
        if (i == 5) {
            return Long.valueOf(this.e);
        }
        if (i == 6) {
            return Boolean.valueOf(this.f);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return g;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = z;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.f = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 3) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.c = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = j;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an long."));
            }
            this.e = j;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.e(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.o(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            arxc.q(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            arxc.q(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            arxc.e(parcel, 6, this.f);
        }
        arxc.c(parcel, a);
    }

    public ScreenlockState() {
        this.a = new HashSet();
    }

    public ScreenlockState(boolean z, int i, long j, long j2) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = z;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = false;
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
    }
}
