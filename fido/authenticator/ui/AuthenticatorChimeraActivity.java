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
import defpackage.aktr;
import defpackage.aktt;
import defpackage.aqyd;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bbff;
import defpackage.bbfz;
import defpackage.bbgm;
import defpackage.bbhe;
import defpackage.bbhf;
import defpackage.bbhg;
import defpackage.bbhh;
import defpackage.bbhi;
import defpackage.bbhl;
import defpackage.bbhm;
import defpackage.bbhn;
import defpackage.bbjr;
import defpackage.bcni;
import defpackage.bp;
import defpackage.dg;
import defpackage.eihn;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.fnzb;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qex;
import defpackage.qfn;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AuthenticatorChimeraActivity extends qex {
    public static final /* synthetic */ int h = 0;
    private static final asot i = bcni.f("AuthenticatorChimeraActivity");
    private BroadcastReceiver j;
    private bbhf k;
    private ParcelFileDescriptor l;
    private ParcelFileDescriptor m;

    private final bbhe o() {
        return (bbhe) gI().h("authenticator_controller");
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
            ((ejhf) ((ejhf) i.i()).ah((char) 3785)).x("Failed to extract input/output through binder.");
            return null;
        }
        try {
            IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
            return (queryLocalInterface instanceof aktt ? (aktt) queryLocalInterface : new aktr(binder)).a();
        } catch (RemoteException e) {
            ((ejhf) ((ejhf) ((ejhf) i.i()).s(e)).ah((char) 3784)).x("Failed to extract input/output through binder.");
            return null;
        }
    }

    public final bbhe j() {
        bbhe o = o();
        if (o != null) {
            return o;
        }
        bbhe bbheVar = new bbhe();
        bp bpVar = new bp(gI());
        bpVar.v(bbheVar, "authenticator_controller");
        bpVar.d();
        return bbheVar;
    }

    public final /* synthetic */ void k(aqyd aqydVar) {
        try {
            aqydVar.c(getContainerActivity(), 123);
        } catch (IntentSender.SendIntentException e) {
            ((ejhf) ((ejhf) ((ejhf) i.i()).s(e)).ah((char) 3790)).x("Failed to launch the resolution for turning on BT Scanning.");
        }
    }

    public final void l(int i2) {
        setResult(i2 == 0 ? -1 : 0);
        finish();
    }

    public final void m(SourceDirectTransferResult sourceDirectTransferResult) {
        Intent intent = new Intent();
        arxd.l(sourceDirectTransferResult, intent, "source_direct_transfer_result");
        if (eihn.a(sourceDirectTransferResult.a, Status.b)) {
            setResult(-1, intent);
        } else {
            setResult(0, intent);
        }
        finish();
    }

    public final void n(int i2) {
        dg g = gI().g(R.id.fido_authenticator_fragment_container);
        dg dgVar = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 6) {
                        if (i2 == 7) {
                            String stringExtra = getIntent().getStringExtra("account_name");
                            eiig.x(stringExtra);
                            int i3 = bbhg.a;
                            Bundle bundle = new Bundle();
                            arwm.q(stringExtra);
                            bundle.putString("account_name", stringExtra);
                            dgVar = new bbhg();
                            dgVar.setArguments(bundle);
                        }
                    } else if (!(g instanceof bbhn)) {
                        String stringExtra2 = getIntent().getStringExtra("account_name");
                        dgVar = new bbhn();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("account-name", stringExtra2);
                        dgVar.setArguments(bundle2);
                    }
                } else if (!(g instanceof bbhm)) {
                    dgVar = new bbhm();
                }
            } else if (bbjr.b(getIntent().getIntArrayExtra("experiment_id_list"))) {
                if (!(g instanceof bbhl)) {
                    new bbhl().setArguments(new Bundle());
                    dgVar = new bbhl();
                }
            } else if (!(g instanceof bbhi)) {
                dgVar = new bbhi();
            }
        } else if (!(g instanceof bbhh)) {
            dgVar = new bbhh();
        }
        if (dgVar != null) {
            bp bpVar = new bp(gI());
            bpVar.F(R.id.fido_authenticator_fragment_container, dgVar);
            bpVar.a();
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 123) {
            return;
        }
        this.k.b(i3 == -1 ? 1 : 16);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        bbhe o = o();
        if (o == null) {
            m(new SourceDirectTransferResult(Status.f, 0));
            return;
        }
        bbgm bbgmVar = (bbgm) o.getChildFragmentManager().h("authentication_fragment");
        if (bbgmVar != null) {
            bbgmVar.ak = true;
            bbgmVar.y();
            return;
        }
        DataInputStream dataInputStream = o.c;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (IOException e) {
                ((ejhf) ((ejhf) ((ejhf) bbhe.a.i()).s(e)).ah((char) 3836)).x("Failed to close the input pipe.");
            }
        }
        DataOutputStream dataOutputStream = o.d;
        if (dataOutputStream != null) {
            try {
                dataOutputStream.close();
            } catch (IOException e2) {
                ((ejhf) ((ejhf) ((ejhf) bbhe.a.i()).s(e2)).ah((char) 3835)).x("Failed to close the output pipe.");
            }
        }
        ((bbhf) new jrh((qfn) o.requireContext()).a(bbhf.class)).a(new SourceDirectTransferResult(Status.f, 0));
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && fnzb.k() && asqh.g()) {
            SourceStartDirectTransferOptions sourceStartDirectTransferOptions = (SourceStartDirectTransferOptions) bundle.getParcelable("source_start_direct_transfer_options");
            int i2 = bundle.getInt("background_service_stage");
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("direct_transfer_data_input");
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) bundle.getParcelable("direct_transfer_data_output");
            if (parcelFileDescriptor == null || parcelFileDescriptor2 == null || sourceStartDirectTransferOptions == null) {
                ((ejhf) ((ejhf) i.j()).ah((char) 3791)).x("Error - Missing parameter from savedInstanceState.");
            } else {
                bbff bbffVar = new bbff();
                bbffVar.b = sourceStartDirectTransferOptions;
                bbffVar.b(parcelFileDescriptor, parcelFileDescriptor2);
                bbffVar.c(i2);
                setIntent(bbffVar.a());
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
        jrh jrhVar = new jrh(this);
        bbhf bbhfVar = (bbhf) jrhVar.a(bbhf.class);
        this.k = bbhfVar;
        bbhfVar.b.g(this, new jpd() { // from class: bbew
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AuthenticatorChimeraActivity.this.n(((Integer) obj).intValue());
            }
        });
        this.k.a.g(this, new jpd() { // from class: bbex
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AuthenticatorChimeraActivity.this.m((SourceDirectTransferResult) obj);
            }
        });
        this.k.c.g(this, new jpd() { // from class: bbey
            @Override // defpackage.jpd
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
        this.k.e.g(this, new jpd() { // from class: bbez
            @Override // defpackage.jpd
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    AuthenticatorChimeraActivity authenticatorChimeraActivity = AuthenticatorChimeraActivity.this;
                    authenticatorChimeraActivity.sendBroadcast(new Intent("com.google.android.gms.fido.authenticator.service.authenticator_activity_state_update").putExtra("change_password_button_pressed", true).setPackage(authenticatorChimeraActivity.getPackageName()));
                    authenticatorChimeraActivity.l(16);
                }
            }
        });
        this.k.d.g(this, new jpd() { // from class: bbfa
            @Override // defpackage.jpd
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
        this.k.f.g(this, new jpd() { // from class: bbfb
            @Override // defpackage.jpd
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
        this.k.g.g(this, new jpd() { // from class: bbfc
            @Override // defpackage.jpd
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    bbhe j = AuthenticatorChimeraActivity.this.j();
                    bzir bzirVar = new bzir();
                    bzirVar.c();
                    LocationSettingsRequest a = bzirVar.a();
                    Context requireContext = j.requireContext();
                    aqxd aqxdVar = bziq.a;
                    ensj.t(doci.b(new aqxo(requireContext, (float[][]) null).ae(a)), new bbhd(j), new enrf());
                }
            }
        });
        this.k.h.g(this, new jpd() { // from class: bbfd
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AuthenticatorChimeraActivity.this.k((aqyd) obj);
            }
        });
        ((bbfz) jrhVar.a(bbfz.class)).d.g(this, new jpd() { // from class: bbfe
            @Override // defpackage.jpd
            public final void a(Object obj) {
                bp bpVar = new bp(AuthenticatorChimeraActivity.this.gI());
                bpVar.v((dg) obj, "user_verify_challenge");
                bpVar.d();
            }
        });
        p();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        sendBroadcast(new Intent("com.google.android.gms.fido.authenticator.service.authenticator_activity_completion").setPackage(getPackageName()));
        BroadcastReceiver broadcastReceiver = this.j;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.j = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        setIntent(intent);
        p();
        super.onNewIntent(intent);
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        if (fnzb.k() && asqh.g()) {
            if (this.l == null || this.m == null) {
                Bundle bundleExtra = getIntent().getBundleExtra("direct_transfer_data_pipe");
                if (bundleExtra == null) {
                    ((ejhf) ((ejhf) i.h()).ah((char) 3792)).x("Unable to extract bundle from intent.");
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
