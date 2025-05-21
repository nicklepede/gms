package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.dcvk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountTransferResult extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dcvk();
    private static final HashMap f;
    public final Set a;
    public BootstrapAccount b;
    public int c;
    public int d;
    public SupervisedAccountInfo e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("bootstrapAccount", new FastJsonResponse$Field(11, false, 11, false, "bootstrapAccount", 2, BootstrapAccount.class));
        hashMap.put("RESULT", new FastJsonResponse$Field(0, false, 0, false, "RESULT", 3, null));
        hashMap.put("lockScreenAuthenticationType", new FastJsonResponse$Field(0, false, 0, false, "lockScreenAuthenticationType", 4, null));
        hashMap.put("supervisedAccountInfo", new FastJsonResponse$Field(11, false, 11, false, "supervisedAccountInfo", 5, SupervisedAccountInfo.class));
    }

    public AccountTransferResult(Set set, BootstrapAccount bootstrapAccount, int i, int i2, SupervisedAccountInfo supervisedAccountInfo) {
        this.a = set;
        this.b = bootstrapAccount;
        this.c = i;
        this.d = i2;
        this.e = supervisedAccountInfo;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return Integer.valueOf(this.c);
        }
        if (i == 4) {
            return Integer.valueOf(this.d);
        }
        if (i == 5) {
            return this.e;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return f;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = (BootstrapAccount) ashsVar;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a concrete type.", Integer.valueOf(i)));
            }
            this.e = (SupervisedAccountInfo) ashsVar;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = i;
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be an int.", Integer.valueOf(i2)));
            }
            this.d = i;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.t(parcel, 2, this.b, i, true);
        }
        if (set.contains(3)) {
            arxc.o(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            arxc.o(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            arxc.t(parcel, 5, this.e, i, true);
        }
        arxc.c(parcel, a);
    }

    public AccountTransferResult() {
        this.a = new HashSet();
    }

    public AccountTransferResult(BootstrapAccount bootstrapAccount, int i) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        arwm.s(bootstrapAccount);
        this.b = bootstrapAccount;
        this.c = i;
        hashSet.add(3);
        hashSet.add(2);
    }
}
