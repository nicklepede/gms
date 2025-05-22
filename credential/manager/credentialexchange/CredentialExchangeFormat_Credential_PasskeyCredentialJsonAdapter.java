package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfl;
import defpackage.flfq;
import defpackage.flfr;
import defpackage.flft;
import defpackage.flfy;
import defpackage.flgn;
import defpackage.flhm;
import defpackage.fxsw;
import defpackage.fxxm;
import java.lang.reflect.Constructor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_Credential_PasskeyCredentialJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;
    private volatile Constructor d;

    public CredentialExchangeFormat_Credential_PasskeyCredentialJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("credentialId", "rpId", "userName", "userDisplayName", "userHandle", "key", "fido2Extensions");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(String.class, fxswVar, "credentialId");
        this.c = flgnVar.d(CredentialExchangeFormat$Fido2Extensions.class, fxswVar, "fido2Extensions");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        CredentialExchangeFormat$Fido2Extensions credentialExchangeFormat$Fido2Extensions = null;
        while (flftVar.o()) {
            String str7 = str;
            switch (flftVar.c(this.a)) {
                case -1:
                    flftVar.m();
                    flftVar.n();
                    break;
                case 0:
                    str = (String) this.b.a(flftVar);
                    if (str == null) {
                        throw flhm.c("credentialId", "credentialId", flftVar);
                    }
                    continue;
                case 1:
                    str2 = (String) this.b.a(flftVar);
                    if (str2 == null) {
                        throw flhm.c("rpId", "rpId", flftVar);
                    }
                    break;
                case 2:
                    str3 = (String) this.b.a(flftVar);
                    if (str3 == null) {
                        throw flhm.c("userName", "userName", flftVar);
                    }
                    break;
                case 3:
                    str4 = (String) this.b.a(flftVar);
                    if (str4 == null) {
                        throw flhm.c("userDisplayName", "userDisplayName", flftVar);
                    }
                    break;
                case 4:
                    str5 = (String) this.b.a(flftVar);
                    if (str5 == null) {
                        throw flhm.c("userHandle", "userHandle", flftVar);
                    }
                    break;
                case 5:
                    str6 = (String) this.b.a(flftVar);
                    if (str6 == null) {
                        throw flhm.c("key", "key", flftVar);
                    }
                    break;
                case 6:
                    credentialExchangeFormat$Fido2Extensions = (CredentialExchangeFormat$Fido2Extensions) this.c.a(flftVar);
                    str = str7;
                    i = -65;
                    continue;
            }
            str = str7;
        }
        String str8 = str;
        flftVar.k();
        if (i == -65) {
            if (str8 == null) {
                throw flhm.b("credentialId", "credentialId", flftVar);
            }
            if (str2 == null) {
                throw flhm.b("rpId", "rpId", flftVar);
            }
            if (str3 == null) {
                throw flhm.b("userName", "userName", flftVar);
            }
            if (str4 == null) {
                throw flhm.b("userDisplayName", "userDisplayName", flftVar);
            }
            if (str5 == null) {
                throw flhm.b("userHandle", "userHandle", flftVar);
            }
            if (str6 != null) {
                return new CredentialExchangeFormat$Credential$PasskeyCredential(str8, str2, str3, str4, str5, str6, credentialExchangeFormat$Fido2Extensions);
            }
            throw flhm.b("key", "key", flftVar);
        }
        Constructor constructor = this.d;
        int i2 = i;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            fxxm.c(cls);
            Class cls2 = flhm.d;
            fxxm.c(cls2);
            constructor = CredentialExchangeFormat$Credential$PasskeyCredential.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, CredentialExchangeFormat$Fido2Extensions.class, cls, cls2);
            fxxm.e(constructor, "getDeclaredConstructor(...)");
            this.d = constructor;
        }
        if (str8 == null) {
            throw flhm.b("credentialId", "credentialId", flftVar);
        }
        if (str2 == null) {
            throw flhm.b("rpId", "rpId", flftVar);
        }
        if (str3 == null) {
            throw flhm.b("userName", "userName", flftVar);
        }
        if (str4 == null) {
            throw flhm.b("userDisplayName", "userDisplayName", flftVar);
        }
        if (str5 == null) {
            throw flhm.b("userHandle", "userHandle", flftVar);
        }
        if (str6 == null) {
            throw flhm.b("key", "key", flftVar);
        }
        Object newInstance = constructor.newInstance(str8, str2, str3, str4, str5, str6, credentialExchangeFormat$Fido2Extensions, Integer.valueOf(i2), null);
        fxxm.e(newInstance, "newInstance(...)");
        return (CredentialExchangeFormat$Credential$PasskeyCredential) newInstance;
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Credential$PasskeyCredential credentialExchangeFormat$Credential$PasskeyCredential = (CredentialExchangeFormat$Credential$PasskeyCredential) obj;
        if (credentialExchangeFormat$Credential$PasskeyCredential == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("credentialId");
        flfl flflVar = this.b;
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$PasskeyCredential.a);
        flfyVar.j("rpId");
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$PasskeyCredential.b);
        flfyVar.j("userName");
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$PasskeyCredential.c);
        flfyVar.j("userDisplayName");
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$PasskeyCredential.d);
        flfyVar.j("userHandle");
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$PasskeyCredential.e);
        flfyVar.j("key");
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$PasskeyCredential.f);
        flfyVar.j("fido2Extensions");
        this.c.b(flfyVar, credentialExchangeFormat$Credential$PasskeyCredential.g);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Credential.PasskeyCredential)";
    }
}
