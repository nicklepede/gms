package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.dedk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes7.dex */
public class UserPresence extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dedk();
    private static final HashMap g;
    final Set a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public long f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("lockScreenSecure", new FastJsonResponse$Field(6, false, 6, false, "lockScreenSecure", 2, null));
        hashMap.put("shownLockScreen", new FastJsonResponse$Field(6, false, 6, false, "shownLockScreen", 3, null));
        hashMap.put("lockScreenQuality", new FastJsonResponse$Field(0, false, 0, false, "lockScreenQuality", 4, null));
        hashMap.put("lastUnlockDurationInSeconds", new FastJsonResponse$Field(2, false, 2, false, "lastUnlockDurationInSeconds", 5, null));
        hashMap.put("lockScreenSetupDurationInSeconds", new FastJsonResponse$Field(2, false, 2, false, "lockScreenSetupDurationInSeconds", 6, null));
    }

    public UserPresence(Set set, boolean z, boolean z2, int i, long j, long j2) {
        this.a = set;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Boolean.valueOf(this.b);
        }
        if (i == 3) {
            return Boolean.valueOf(this.c);
        }
        if (i == 4) {
            return Integer.valueOf(this.d);
        }
        if (i == 5) {
            return Long.valueOf(this.e);
        }
        if (i == 6) {
            return Long.valueOf(this.f);
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
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.c = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 4) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.d = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            this.e = j;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an long."));
            }
            this.f = j;
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
            arxc.e(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            arxc.o(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            arxc.q(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            arxc.q(parcel, 6, this.f);
        }
        arxc.c(parcel, a);
    }

    public UserPresence() {
        this.a = new HashSet();
    }
}
