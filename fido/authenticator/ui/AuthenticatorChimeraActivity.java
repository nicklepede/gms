package com.google.android.gms.fido.authenticator.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.authenticator.ui.AuthenticatorChimeraActivity;
import com.google.android.gms.fido.sourcedevice.SourceDirectTransferResult;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import com.google.android.gms.location.LocationSettingsRequest;
import defpackage.amvc;
import defpackage.amve;
import defpackage.atas;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bdjc;
import defpackage.bdjw;
import defpackage.bdkj;
import defpackage.bdlb;
import defpackage.bdlc;
import defpackage.bdld;
import defpackage.bdle;
import defpackage.bdlf;
import defpackage.bdli;
import defpackage.bdlj;
import defpackage.bdlk;
import defpackage.bdno;
import defpackage.beov;
import defpackage.bp;
import defpackage.dg;
import defpackage.ekus;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.fqrd;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.ryb;
import defpackage.ryr;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AuthenticatorChimeraActivity extends ryb {
    public static final /* synthetic */ int h = 0;
    private static final ausn i = beov.f("AuthenticatorChimeraActivity");
    private BroadcastReceiver j;
    private bdlc k;
    private ParcelFileDescriptor l;
    private ParcelFileDescriptor m;

    private final bdlb o() {
        return (bdlb) gY().h("authenticator_controller");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r0 != 8) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.authenticator.ui.AuthenticatorChimeraActivity.p():void");
    }

    private static final ParcelFileDescriptor q(Bundle bundle, String str) {
        IBinder binder = bundle.getBinder(str);
        if (binder == null) {
            ((eluo) ((eluo) i.i()).ai((char) 3791)).x("Failed to extract input/output through binder.");
            return null;
        }
        try {
            IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
            return (queryLocalInterface instanceof amve ? (amve) queryLocalInterface : new amvc(binder)).a();
        } catch (RemoteException e) {
            ((eluo) ((eluo) ((eluo) i.i()).s(e)).ai((char) 3790)).x("Failed to extract input/output through binder.");
            return null;
        }
    }

    public final bdlb j() {
        bdlb o = o();
        if (o != null) {
            return o;
        }
        bdlb bdlbVar = new bdlb();
        bp bpVar = new bp(gY());
        bpVar.v(bdlbVar, "authenticator_controller");
        bpVar.d();
        return bdlbVar;
    }

    public final /* synthetic */ void k(atas atasVar) {
        try {
            atasVar.c(getContainerActivity(), 123);
        } catch (IntentSender.SendIntentException e) {
            ((eluo) ((eluo) ((eluo) i.i()).s(e)).ai((char) 3796)).x("Failed to launch the resolution for turning on BT Scanning.");
        }
    }

    public final void l(int i2) {
        setResult(i2 == 0 ? -1 : 0);
        finish();
    }

    public final void m(SourceDirectTransferResult sourceDirectTransferResult) {
        Intent intent = new Intent();
        atzs.l(sourceDirectTransferResult, intent, "source_direct_transfer_result");
        if (ekus.a(sourceDirectTransferResult.a, Status.b)) {
            setResult(-1, intent);
        } else {
            setResult(0, intent);
        }
        finish();
    }

    public final void n(int i2) {
        dg g = gY().g(R.id.fido_authenticator_fragment_container);
        dg dgVar = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 6) {
                        if (i2 == 7) {
                            String stringExtra = getIntent().getStringExtra("account_name");
                            ekvl.y(stringExtra);
                            int i3 = bdld.a;
                            Bundle bundle = new Bundle();
                            atzb.q(stringExtra);
                            bundle.putString("account_name", stringExtra);
                            dgVar = new bdld();
                            dgVar.setArguments(bundle);
                        }
                    } else if (!(g instanceof bdlk)) {
                        String stringExtra2 = getIntent().getStringExtra("account_name");
                        dgVar = new bdlk();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("account-name", stringExtra2);
                        dgVar.setArguments(bundle2);
                    }
                } else if (!(g instanceof bdlj)) {
                    dgVar = new bdlj();
                }
            } else if (bdno.b(getIntent().getIntArrayExtra("experiment_id_list"))) {
                if (!(g instanceof bdli)) {
                    new bdli().setArguments(new Bundle());
                    dgVar = new bdli();
                }
            } else if (!(g instanceof bdlf)) {
                dgVar = new bdlf();
            }
        } else if (!(g instanceof bdle)) {
            dgVar = new bdle();
        }
        if (dgVar != null) {
            bp bpVar = new bp(gY());
            bpVar.F(R.id.fido_authenticator_fragment_container, dgVar);
            bpVar.a();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 123) {
            return;
        }
        this.k.b(i3 == -1 ? 1 : 16);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        bdlb o = o();
        if (o == null) {
            m(new SourceDirectTransferResult(Status.f, 0));
            return;
        }
        bdkj bdkjVar = (bdkj) o.getChildFragmentManager().h("authentication_fragment");
        if (bdkjVar != null) {
            bdkjVar.ak = true;
            bdkjVar.y();
            return;
        }
        DataInputStream dataInputStream = o.c;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (IOException e) {
                ((eluo) ((eluo) ((eluo) bdlb.a.i()).s(e)).ai((char) 3842)).x("Failed to close the input pipe.");
            }
        }
        DataOutputStream dataOutputStream = o.d;
        if (dataOutputStream != null) {
            try {
                dataOutputStream.close();
            } catch (IOException e2) {
                ((eluo) ((eluo) ((eluo) bdlb.a.i()).s(e2)).ai((char) 3841)).x("Failed to close the output pipe.");
            }
        }
        ((bdlc) new jxw((ryr) o.requireContext()).a(bdlc.class)).a(new SourceDirectTransferResult(Status.f, 0));
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && fqrd.k() && auub.g()) {
            SourceStartDirectTransferOptions sourceStartDirectTransferOptions = (SourceStartDirectTransferOptions) bundle.getParcelable("source_start_direct_transfer_options");
            int i2 = bundle.getInt("background_service_stage");
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("direct_transfer_data_input");
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) bundle.getParcelable("direct_transfer_data_output");
            if (parcelFileDescriptor == null || parcelFileDescriptor2 == null || sourceStartDirectTransferOptions == null) {
                ((eluo) ((eluo) i.j()).ai((char) 3797)).x("Error - Missing parameter from savedInstanceState.");
            } else {
                bdjc bdjcVar = new bdjc();
                bdjcVar.b = sourceStartDirectTransferOptions;
                bdjcVar.b(parcelFileDescriptor, parcelFileDescriptor2);
                bdjcVar.c(i2);
                setIntent(bdjcVar.a());
            }
        }
        if (getIntent().getIntExtra("background_service_stage", -1) == 6) {
            setTheme(R.style.fidoAuthenticatorTransparentTheme);
            setFinishOnTouchOutside(false);
            getWindow().addFlags(128);
        } else {
            setTheme(R.style.Theme_Fido_DayNight);
            setContentView(R.layout.fido_authenticator_activity);
        }
        jxw jxwVar = new jxw(this);
        bdlc bdlcVar = (bdlc) jxwVar.a(bdlc.class);
        this.k = bdlcVar;
        bdlcVar.b.g(this, new jvs() { // from class: bdit
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AuthenticatorChimeraActivity.this.n(((Integer) obj).intValue());
            }
        });
        this.k.a.g(this, new jvs() { // from class: bdiu
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AuthenticatorChimeraActivity.this.m((SourceDirectTransferResult) obj);
            }
        });
        this.k.c.g(this, new jvs() { // from class: bdiv
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Integer num = (Integer) obj;
                Intent intent = new Intent("com.google.android.gms.fido.authenticator.service.authenticator_activity_state_update");
                AuthenticatorChimeraActivity authenticatorChimeraActivity = AuthenticatorChimeraActivity.this;
                Intent intent2 = intent.setPackage(authenticatorChimeraActivity.getPackageName());
                intent2.putExtra("cable_v2_user_authorization_result", num);
                authenticatorChimeraActivity.sendBroadcast(intent2);
                if (num.intValue() == 0) {
                    authenticatorChimeraActivity.l(num.intValue());
                }
            }
        });
        this.k.e.g(this, new jvs() { // from class: bdiw
            @Override // defpackage.jvs
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    AuthenticatorChimeraActivity authenticatorChimeraActivity = AuthenticatorChimeraActivity.this;
                    authenticatorChimeraActivity.sendBroadcast(new Intent("com.google.android.gms.fido.authenticator.service.authenticator_activity_state_update").putExtra("change_password_button_pressed", true).setPackage(authenticatorChimeraActivity.getPackageName()));
                    authenticatorChimeraActivity.l(16);
                }
            }
        });
        this.k.d.g(this, new jvs() { // from class: bdix
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Integer num = (Integer) obj;
                Intent intent = new Intent("com.google.android.gms.fido.authenticator.service.authenticator_activity_state_update");
                AuthenticatorChimeraActivity authenticatorChimeraActivity = AuthenticatorChimeraActivity.this;
                Intent intent2 = intent.setPackage(authenticatorChimeraActivity.getPackageName());
                intent2.putExtra("turn_on_bluetooth_result", num);
                authenticatorChimeraActivity.sendBroadcast(intent2);
                if (num.intValue() == 0) {
                    authenticatorChimeraActivity.n(1);
                } else {
                    if (num.intValue() == 1) {
                        return;
                    }
                    authenticatorChimeraActivity.l(num.intValue());
                }
            }
        });
        this.k.f.g(this, new jvs() { // from class: bdiy
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Integer num = (Integer) obj;
                Intent intent = new Intent("com.google.android.gms.fido.authenticator.service.authenticator_activity_state_update");
                AuthenticatorChimeraActivity authenticatorChimeraActivity = AuthenticatorChimeraActivity.this;
                Intent intent2 = intent.setPackage(authenticatorChimeraActivity.getPackageName());
                intent2.putExtra("turn_on_location_result", num);
                authenticatorChimeraActivity.sendBroadcast(intent2);
                authenticatorChimeraActivity.l(num.intValue());
            }
        });
        this.k.g.g(this, new jvs() { // from class: bdiz
            @Override // defpackage.jvs
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    bdlb j = AuthenticatorChimeraActivity.this.j();
                    cbri cbriVar = new cbri();
                    cbriVar.c();
                    LocationSettingsRequest a = cbriVar.a();
                    Context requireContext = j.requireContext();
                    aszs aszsVar = cbrh.a;
                    eqgc.t(dqmr.b(new atad(requireContext, (float[][]) null).ae(a)), new bdla(j), new eqey());
                }
            }
        });
        this.k.h.g(this, new jvs() { // from class: bdja
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AuthenticatorChimeraActivity.this.k((atas) obj);
            }
        });
        ((bdjw) jxwVar.a(bdjw.class)).d.g(this, new jvs() { // from class: bdjb
            @Override // defpackage.jvs
            public final void a(Object obj) {
                bp bpVar = new bp(AuthenticatorChimeraActivity.this.gY());
                bpVar.v((dg) obj, "user_verify_challenge");
                bpVar.d();
            }
        });
        p();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        sendBroadcast(new Intent("com.google.android.gms.fido.authenticator.service.authenticator_activity_completion").setPackage(getPackageName()));
        BroadcastReceiver broadcastReceiver = this.j;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.j = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        setIntent(intent);
        p();
        super.onNewIntent(intent);
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        if (fqrd.k() && auub.g()) {
            if (this.l == null || this.m == null) {
                Bundle bundleExtra = getIntent().getBundleExtra("direct_transfer_data_pipe");
                if (bundleExtra == null) {
                    ((eluo) ((eluo) i.h()).ai((char) 3798)).x("Unable to extract bundle from intent.");
                    return;
                } else {
                    this.l = q(bundleExtra, "direct_transfer_data_input");
                    this.m = q(bundleExtra, "direct_transfer_data_output");
                }
            }
            bundle.putParcelable("direct_transfer_data_input", this.l);
            bundle.putParcelable("direct_transfer_data_output", this.m);
            bundle.putInt("background_service_stage", getIntent().getIntExtra("background_service_stage", -1));
            bundle.putParcelable("source_start_direct_transfer_options", getIntent().getParcelableExtra("source_start_direct_transfer_options"));
        }
    }
}
