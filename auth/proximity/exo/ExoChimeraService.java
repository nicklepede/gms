package com.google.android.gms.auth.proximity.exo;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.NearbyConnectionsIntentOperation;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.exo.ExoChimeraService;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import defpackage.a;
import defpackage.accd;
import defpackage.acek;
import defpackage.acgs;
import defpackage.achq;
import defpackage.achr;
import defpackage.acih;
import defpackage.aciq;
import defpackage.acir;
import defpackage.acis;
import defpackage.acit;
import defpackage.aciw;
import defpackage.aciz;
import defpackage.acjf;
import defpackage.acjl;
import defpackage.acjm;
import defpackage.acjn;
import defpackage.acjy;
import defpackage.ackv;
import defpackage.ackx;
import defpackage.aclb;
import defpackage.aclg;
import defpackage.aclh;
import defpackage.aclj;
import defpackage.acnh;
import defpackage.acqe;
import defpackage.acse;
import defpackage.acsn;
import defpackage.actz;
import defpackage.acvm;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.brzd;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.enre;
import defpackage.enss;
import defpackage.ensv;
import defpackage.fdso;
import defpackage.feay;
import defpackage.febe;
import defpackage.febf;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feex;
import defpackage.fefm;
import defpackage.flcm;
import defpackage.flcw;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ExoChimeraService extends Service implements acgs {
    public static final arxo a = new arxo("ProximityAuth", "ExoService");
    private static final acjn f = new acjn(new acjl(AppContextProvider.a(), brzd.v()));
    public final acih b;
    public final aciw c;
    public final aciz d;
    private final ensv e;

    public ExoChimeraService() {
        this(new asmf(1, 10));
    }

    private final void b(final String str) {
        RemoteDevice b = achr.c().b(str);
        if (b == null) {
            a.f("Can't find RemoteDevice for deviceId=%s", str);
            return;
        }
        final String str2 = b.d;
        final enss b2 = acvm.a(str2).b();
        b2.hn(new Runnable() { // from class: acjg
            @Override // java.lang.Runnable
            public final void run() {
                enss enssVar = b2;
                String str3 = str;
                try {
                    ackw ackwVar = (ackw) ensj.r(enssVar);
                    ackw ackwVar2 = ackw.ACCESS_UNKNOWN;
                    String str4 = str2;
                    ExoChimeraService exoChimeraService = ExoChimeraService.this;
                    if (ackwVar == ackwVar2) {
                        exoChimeraService.a(str4);
                        return;
                    }
                    boolean z = ackwVar == ackw.ACCESS_GRANTED;
                    Boolean valueOf = Boolean.valueOf(z);
                    ExoChimeraService.a.h("Found exo association pref %s", valueOf);
                    aciw aciwVar = exoChimeraService.c;
                    valueOf.getClass();
                    acir acirVar = (acir) aciwVar.b.get(str3);
                    if (acirVar != null) {
                        acirVar.a(z, str4);
                    }
                    if (flcm.a.a().i()) {
                        exoChimeraService.a(str4);
                    }
                } catch (ExecutionException e) {
                    ExoChimeraService.a.n("Failed to load exo association cache", e, new Object[0]);
                }
            }
        }, enre.a);
    }

    public final void a(String str) {
        aciw aciwVar = this.c;
        if (!aciwVar.e()) {
            aciwVar.b();
        }
        acjf acjfVar = aciwVar.c;
        if (acjfVar.q == null) {
            acjf.a.h("The signalingService is not ready to check CDM association, queue the CDM request.", new Object[0]);
            acjfVar.c.add(str);
        } else {
            try {
                acjfVar.q.a(str);
            } catch (RemoteException e) {
                acjf.a.g("Could not process checkCdmAssociation()", e, new Object[0]);
            }
        }
    }

    @Override // defpackage.acgs
    public final void d(String str, int i, int i2, int i3) {
        String str2;
        if (i != 5) {
            return;
        }
        a.h("Connection status changed from %s to %s for device %s", ConnectionInfo.a(i2), ConnectionInfo.a(i3), acek.a(str));
        if (i3 != 3) {
            if (i3 == 0) {
                aciw aciwVar = this.c;
                acjf acjfVar = aciwVar.c;
                acjfVar.f.remove(str);
                acjfVar.e.remove(str);
                acir acirVar = (acir) aciwVar.b.remove(str);
                if (acirVar != null) {
                    acir.a.h("close streamStatus=%d", Integer.valueOf(acirVar.f));
                    int i4 = acirVar.f;
                    if (i4 == 2 || i4 == 1) {
                        acirVar.b.c(acirVar.c);
                    }
                    acirVar.e();
                }
                aciwVar.d();
                return;
            }
            return;
        }
        aciw aciwVar2 = this.c;
        if (aciwVar2.a(str) == null) {
            acqe acqeVar = new acqe();
            acqeVar.b("exo_connected_count");
            acqeVar.c();
            acjf acjfVar2 = aciwVar2.c;
            acjfVar2.f.put(str, new acis(aciwVar2, str));
            acjfVar2.e.put(str, new acit(aciwVar2, str));
            str2 = str;
            acir acirVar2 = new acir(acjfVar2, str2, new acjy(), aciwVar2.d, aciwVar2.e);
            acjfVar2.h = acirVar2;
            aciwVar2.b.put(str2, acirVar2);
        } else {
            str2 = str;
        }
        Map map = aciwVar2.b;
        if (flcw.q()) {
            aciz.a.h("Enterprise policy - getAppStreamingPolicy(): %s (1=disabled, 2=enabled)", 0);
        }
        acir acirVar3 = (acir) map.get(str2);
        if (acirVar3 != null) {
            acir.a.h("sendAppPolicyStateMessage", new Object[0]);
            fecj v = aclb.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((aclb) v.b).b = 2;
            aclb aclbVar = (aclb) v.Q();
            fecj v2 = ackx.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            String str3 = acirVar3.c;
            ackx ackxVar = (ackx) v2.b;
            aclbVar.getClass();
            ackxVar.c = aclbVar;
            ackxVar.b = 10;
            aciq.a(str3, (ackx) v2.Q());
        }
        b(str2);
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder("==== ExoService Dump ====\nisAdvertising: ");
        sb.append(NearbyConnectionsIntentOperation.b);
        sb.append("\nregisteredDevices: \n");
        Iterator it = this.b.b().iterator();
        while (it.hasNext()) {
            sb.append((RemoteDevice) it.next());
            sb.append("\n");
        }
        sb.append(this.c);
        sb.append("mendel flags: \nisExoAvailable(): false\nisExoHostSupported(): ");
        acjm.b();
        sb.append(true != flcm.g() ? "false" : "true");
        sb.append("\nsetExoHostSupported(): ");
        sb.append(true != flcm.h() ? "false" : "true");
        sb.append("\nenforceDeviceProximity(): ");
        sb.append(true != flcm.f() ? "false" : "true");
        sb.append("\nisAttestationEnforced(): ");
        sb.append(true == flcm.a.a().g() ? "true" : "false");
        sb.append("\n");
        printWriter.append((CharSequence) sb.toString());
    }

    @Override // defpackage.acgs
    public final void e(String str, String str2, byte[] bArr) {
        int i;
        eiid eiidVar;
        AttestationVerifier attestationVerifier;
        char c = 0;
        try {
            fecp y = fecp.y(fdso.a, bArr, 0, bArr.length, febw.a());
            fecp.M(y);
            fdso fdsoVar = (fdso) y;
            a.d(a.D(fdsoVar.b, "CDS_GMS_onMessageReceived WebRtcSignal session: "), new Object[0]);
            f.a(fdsoVar, 14);
        } catch (fedk e) {
            a.n("Failed to log incoming signaling message.", e, new Object[0]);
        }
        if (Objects.equals(str2, "eche")) {
            acir a2 = this.c.a(str);
            int i2 = 1;
            if (a2 == null) {
                a.m("Received message for device with no registered connections. deviceId=%s", str);
                return;
            }
            if (flcm.a.a().m()) {
                achr c2 = achr.c();
                synchronized (c2.c) {
                    achq achqVar = (achq) c2.b.get(str);
                    if (achqVar != null && (attestationVerifier = achqVar.b) != null) {
                        eiidVar = eiid.j(attestationVerifier);
                    }
                    eiidVar = eigb.a;
                }
                if (!eiidVar.h()) {
                    a.m("Received message for device with no attestation certificate available. deviceId=%s", str);
                    return;
                }
                AttestationVerifier attestationVerifier2 = (AttestationVerifier) eiidVar.c();
                int i3 = attestationVerifier2.d;
                if (i3 == 3) {
                    Log.e("AttestationVerifier", "Certificate previously failed to verify");
                } else {
                    if (i3 != 2 || attestationVerifier2.a()) {
                        int i4 = attestationVerifier2.b;
                        if (i4 == acsn.a(3)) {
                            byte[][] bArr2 = attestationVerifier2.a;
                            int length = bArr2.length;
                            if (length == 0) {
                                Log.e("AttestationVerifier", "No certificates to verify");
                            } else {
                                ArrayList arrayList = new ArrayList(length);
                                int i5 = 0;
                                while (true) {
                                    if (i5 < bArr2.length) {
                                        X509Certificate a3 = attestationVerifier2.c.a(bArr2[i5]);
                                        if (a3 == null) {
                                            Log.e("AttestationVerifier", "Could not convert the attestation data to a set of valid certificates");
                                            break;
                                        }
                                        arrayList.add(a3);
                                        eitj k = eitj.k(a3.getSubjectX500Principal().getName("CANONICAL").split(","));
                                        int basicConstraints = a3.getBasicConstraints();
                                        if (i5 == i2) {
                                            if (((ejcb) k).c != 2 || !k.contains("o=chrome device soft bind") || !k.contains("cn=local authority")) {
                                                break;
                                            }
                                            if (!AttestationVerifier.b(a3.getKeyUsage(), 5)) {
                                                break;
                                            }
                                            if (basicConstraints != 0) {
                                                Log.e("AttestationVerifier", "Penultimate cert PathLen constraint is incorrect");
                                                break;
                                            } else {
                                                i5++;
                                                i2 = 1;
                                            }
                                        } else if (i5 == 0) {
                                            if (((ejcb) k).c != 2 || !k.contains("o=chrome device soft bind") || !k.contains("cn=cryptauth user key")) {
                                                break;
                                            }
                                            if (!AttestationVerifier.b(a3.getKeyUsage(), 0)) {
                                                break;
                                            }
                                            if (basicConstraints != -1) {
                                                Log.e("AttestationVerifier", "Leaf cert PathLen constraint is incorrect");
                                                break;
                                            } else if (a3.getNotAfter().getTime() - a3.getNotBefore().getTime() > 259200000) {
                                                Log.e("AttestationVerifier", "Leaf cert issued for longer than allowed period");
                                                break;
                                            } else {
                                                i5++;
                                                i2 = 1;
                                            }
                                        } else if (basicConstraints == 0) {
                                            Log.e("AttestationVerifier", "Multiple or misplaced terminal local ca cert(s)");
                                            break;
                                        } else {
                                            i5++;
                                            i2 = 1;
                                        }
                                    } else {
                                        accd accdVar = attestationVerifier2.c;
                                        TrustAnchor trustAnchor = accdVar.b;
                                        if (trustAnchor == null || !accdVar.b(arrayList, trustAnchor)) {
                                            Log.e("AttestationVerifier", "Could not validate chain");
                                        } else {
                                            Log.i("AttestationVerifier", "CROS_SOFT_BIND certificate verified");
                                            attestationVerifier2.d = 2;
                                        }
                                    }
                                }
                            }
                            Log.e("AttestationVerifier", "CROS_SOFT_BIND certificate NOT verified");
                        } else {
                            Log.e("AttestationVerifier", a.j(i4, "Not possible to perform verification for this type: "));
                        }
                    } else {
                        Log.e("AttestationVerifier", "Certificate is now outside the validity period");
                    }
                    attestationVerifier2.d = 3;
                }
                a.m("Received message for device which failed the attestation check. deviceId=%s", str);
                return;
            }
            try {
                feay w = feay.w(bArr);
                febw a4 = febw.a();
                ackx ackxVar = ackx.a;
                febe k2 = w.k();
                fecp x = ackxVar.x();
                try {
                    try {
                        feex b = feep.a.b(x);
                        b.l(x, febf.p(k2), a4);
                        b.g(x);
                        try {
                            k2.z(0);
                            fecp.M(x);
                            ackx ackxVar2 = (ackx) x;
                            int i6 = ackxVar2.b;
                            switch (i6) {
                                case 0:
                                    i = 11;
                                    break;
                                case 1:
                                    i = 1;
                                    break;
                                case 2:
                                    i = 2;
                                    break;
                                case 3:
                                    i = 3;
                                    break;
                                case 4:
                                    i = 4;
                                    break;
                                case 5:
                                    i = 5;
                                    break;
                                case 6:
                                    i = 6;
                                    break;
                                case 7:
                                    i = 7;
                                    break;
                                case 8:
                                    i = 8;
                                    break;
                                case 9:
                                    i = 9;
                                    break;
                                case 10:
                                    i = 10;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            int i7 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            if (i7 == 0) {
                                aciw aciwVar = this.c;
                                if (!aciwVar.e()) {
                                    aciwVar.b();
                                }
                                acir.a.h("Received signaling message: ".concat(String.valueOf(String.valueOf(ackxVar2))), new Object[0]);
                                new acqe().B("exo_message_received", 0);
                                acjf acjfVar = a2.b;
                                String str3 = a2.c;
                                feay feayVar = (ackxVar2.b == 1 ? (aclh) ackxVar2.c : aclh.a).b;
                                if (feayVar.K()) {
                                    acjf.a.f("Could not process received request as it is empty", new Object[0]);
                                } else {
                                    acjfVar.b.add(new ackv(str3, feayVar));
                                    acjfVar.a(acjfVar.k);
                                }
                                int i8 = a2.f;
                                if (i8 == 0 || i8 == 3) {
                                    a2.f = 1;
                                    return;
                                }
                                return;
                            }
                            if (i7 == 6) {
                                a.h("Received APPS_ACCESS_STATE_REQUEST for deviceId=%s", str);
                                b(str);
                                return;
                            }
                            if (i7 == 8) {
                                int i9 = (i6 == 9 ? (aclj) ackxVar2.c : aclj.a).b;
                                char c3 = i9 != 0 ? i9 != 1 ? i9 != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
                                if (c3 != 0 && c3 == 3) {
                                    acir.a.h("Received stream start message: ".concat(String.valueOf(String.valueOf(ackxVar2))), new Object[0]);
                                    return;
                                } else {
                                    acir.a.h("Received stream stop message: ".concat(String.valueOf(String.valueOf(ackxVar2))), new Object[0]);
                                    return;
                                }
                            }
                            if (i7 == 2) {
                                int i10 = (i6 == 3 ? (aclg) ackxVar2.c : aclg.a).b;
                                if (i10 == 0) {
                                    c = 2;
                                } else if (i10 == 1) {
                                    c = 3;
                                }
                                if (c == 0 || c != 3) {
                                    return;
                                }
                                aciw aciwVar2 = this.c;
                                if (!aciwVar2.e() || flcm.f()) {
                                    return;
                                }
                                aciwVar2.c();
                                return;
                            }
                            if (i7 == 3) {
                                if (flcm.e()) {
                                    a.h("Received proximity ping for device %s", str);
                                }
                                if (flcm.f()) {
                                    acjy acjyVar = a2.d;
                                    if (acjyVar.c()) {
                                        int i11 = acjyVar.d;
                                        if (i11 == 3 || i11 == 4 || i11 == 5) {
                                            acjyVar.d = 2;
                                        }
                                        acjyVar.c = SystemClock.elapsedRealtime() + 300000;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (i7 != 4) {
                                a.m("Received unsupported message type for deviceId=%s", str);
                                return;
                            }
                            arxo arxoVar = a;
                            arxoVar.h("Received SEND_APPS_SETUP_REQUEST for deviceId=%s", str);
                            aciw aciwVar3 = this.c;
                            if (!aciwVar3.e()) {
                                aciwVar3.b();
                            }
                            RemoteDevice b2 = achr.c().b(str);
                            if (b2 == null) {
                                arxoVar.m("Cannot get RemoteDevice for deviceId=%s", str);
                                return;
                            }
                            String string = getString(R.string.proximity_auth_chromebook);
                            acjf acjfVar2 = aciwVar3.c;
                            acnh acnhVar = acjfVar2.q;
                            String str4 = b2.d;
                            if (acnhVar == null) {
                                acjf.a.h("The signalingService is not ready to start CDM association, queue the CDM request.", new Object[0]);
                                acjfVar2.d.put(str4, string);
                            } else {
                                try {
                                    acjfVar2.q.b(str4, string);
                                } catch (RemoteException e2) {
                                    acjf.a.g("Could not process startCdmAssociation()", e2, new Object[0]);
                                }
                            }
                        } catch (fedk e3) {
                            throw e3;
                        }
                    } catch (fedk e4) {
                        if (!e4.a) {
                            throw e4;
                        }
                        throw new fedk(e4);
                    } catch (fefm e5) {
                        throw e5.a();
                    }
                } catch (IOException e6) {
                    if (!(e6.getCause() instanceof fedk)) {
                        throw new fedk(e6);
                    }
                    throw ((fedk) e6.getCause());
                } catch (RuntimeException e7) {
                    if (!(e7.getCause() instanceof fedk)) {
                        throw e7;
                    }
                    throw ((fedk) e7.getCause());
                }
            } catch (fedk e8) {
                a.n("Failed to parse incoming message from deviceId=".concat(String.valueOf(str)), e8, new Object[0]);
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        aciw aciwVar = this.c;
        aciwVar.c();
        aciwVar.b.clear();
        aciwVar.f(true);
        this.b.c(this);
        acse acseVar = this.d.d;
        this.e.shutdown();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        acjm.b();
        new acqe().B("start_exo_service_result", 1);
        stopSelf();
        return 2;
    }

    public ExoChimeraService(acih acihVar, ensv ensvVar, aciw aciwVar, aciz acizVar) {
        this.b = acihVar;
        this.e = ensvVar;
        this.c = aciwVar;
        this.d = acizVar;
    }

    private ExoChimeraService(ensv ensvVar) {
        this(new acih("eche"), ensvVar, new aciw(new acjf(AppContextProvider.a(), ensvVar, f), flcw.p() ? actz.b(AppContextProvider.a()) : null, ensvVar), new aciz(AppContextProvider.a()));
    }
}
