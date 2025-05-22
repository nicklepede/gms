package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import defpackage.a;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.xkj;
import defpackage.xkk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountTransferMsg extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new xkk();
    private static final HashMap f;
    final Set a;
    final int b;
    public ArrayList c;
    public int d;
    public AccountTransferProgress e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse$Field(11, true, 11, true, "authenticatorData", 2, AuthenticatorAnnotatedData.class));
        hashMap.put("progress", new FastJsonResponse$Field(11, false, 11, false, "progress", 4, AccountTransferProgress.class));
    }

    public AccountTransferMsg(Set set, int i, ArrayList arrayList, int i2, AccountTransferProgress accountTransferProgress) {
        this.a = set;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = accountTransferProgress;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return f;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
        }
        this.c = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), aulmVar.getClass().getCanonicalName()));
        }
        this.e = (AccountTransferProgress) aulmVar;
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(1)) {
            atzr.o(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            atzr.y(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            atzr.o(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            atzr.t(parcel, 4, this.e, i, true);
        }
        atzr.c(parcel, a);
    }

    public AccountTransferMsg() {
        this.a = new HashSet(1);
        this.b = 1;
    }

    public AccountTransferMsg(xkj xkjVar) {
        this(xkjVar.d, 1, xkjVar.a, xkjVar.b, xkjVar.c);
    }
}
