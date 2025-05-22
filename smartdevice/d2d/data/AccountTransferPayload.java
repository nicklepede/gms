package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.afpn;
import defpackage.atzr;
import defpackage.aulw;
import defpackage.auly;
import defpackage.bsj;
import defpackage.dfqu;
import defpackage.dgyt;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AccountTransferPayload extends BinarySerializableFastSafeParcelableJson {
    private static final Map d;
    final Set a;
    public byte[] b;
    private static final dgyt c = new dgyt(new String[]{"D2D", "AccountTransferPayload"});
    public static final Parcelable.Creator CREATOR = new dfqu();

    static {
        bsj bsjVar = new bsj();
        d = bsjVar;
        bsjVar.put("accountTransferMsg", new FastJsonResponse$Field(8, false, 8, false, "accountTransferMsg", 2, null));
    }

    public AccountTransferPayload(Set set, byte[] bArr) {
        this.a = set;
        this.b = bArr;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final Map b() {
        return d;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void gu(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array"));
        }
        this.b = bArr;
        this.a.add(Integer.valueOf(i));
    }

    public final AccountTransferMsg p() {
        if (this.b == null) {
            return null;
        }
        AccountTransferMsg accountTransferMsg = new AccountTransferMsg();
        try {
            try {
                new auly().h(new ByteArrayInputStream(this.b), accountTransferMsg);
                return accountTransferMsg;
            } catch (aulw e) {
                throw new afpn(e.getMessage());
            }
        } catch (afpn e2) {
            c.g("Failed populating AccountTransferMsg from bytes", e2, new Object[0]);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.i(parcel, 2, this.b, true);
        }
        atzr.c(parcel, a);
    }

    public AccountTransferPayload() {
        this.a = new HashSet();
    }

    public AccountTransferPayload(AccountTransferMsg accountTransferMsg) {
        byte[] bArr;
        this.a = new HashSet();
        try {
            bArr = accountTransferMsg.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e("AUTH", "Error serializing object.", e);
            bArr = null;
        }
        this.b = bArr;
        this.a.add(2);
    }
}
