package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.ddfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountBootstrapPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddfo();
    private static final HashMap g;
    public final Set a;
    public ArrayList b;
    public ArrayList c;
    public ExchangeAssertionsForUserCredentialsRequest d;
    public ArrayList e;
    public ExchangeSessionCheckpointsForUserCredentialsRequest f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("userBootstrapInfos", new FastJsonResponse$Field(11, true, 11, true, "userBootstrapInfos", 2, UserBootstrapInfo.class));
        hashMap.put("challenges", new FastJsonResponse$Field(11, true, 11, true, "challenges", 3, Challenge.class));
        hashMap.put("exchangeAssertionsForUserCredentialsRequest", new FastJsonResponse$Field(11, false, 11, false, "exchangeAssertionsForUserCredentialsRequest", 4, ExchangeAssertionsForUserCredentialsRequest.class));
        hashMap.put("userCredentials", new FastJsonResponse$Field(11, true, 11, true, "userCredentials", 5, UserCredential.class));
        hashMap.put("exchangeSessionCheckpointsForUserCredentialsRequest", new FastJsonResponse$Field(11, false, 11, false, "exchangeSessionCheckpointsForUserCredentialsRequest", 6, ExchangeSessionCheckpointsForUserCredentialsRequest.class));
    }

    public AccountBootstrapPayload(Set set, ArrayList arrayList, ArrayList arrayList2, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest, ArrayList arrayList3, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        this.a = set;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = exchangeAssertionsForUserCredentialsRequest;
        this.e = arrayList3;
        this.f = exchangeSessionCheckpointsForUserCredentialsRequest;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        if (i == 6) {
            return this.f;
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
    public final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
        } else if (i == 3) {
            this.c = arrayList;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(a.ag(i, arrayList, " is not a known array of custom type.  Found "));
            }
            this.e = arrayList;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = (ExchangeAssertionsForUserCredentialsRequest) ashsVar;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), ashsVar.getClass().getCanonicalName()));
            }
            this.f = (ExchangeSessionCheckpointsForUserCredentialsRequest) ashsVar;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.y(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.y(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.t(parcel, 4, this.d, i, true);
        }
        if (set.contains(5)) {
            arxc.y(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.t(parcel, 6, this.f, i, true);
        }
        arxc.c(parcel, a);
    }

    public AccountBootstrapPayload() {
        this.a = new HashSet();
    }
}
