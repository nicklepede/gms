package com.google.android.gms.significantplaces.settings;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.significantplaces.settings.PlacePickerChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arwm;
import defpackage.asot;
import defpackage.bp;
import defpackage.bzhj;
import defpackage.bzhs;
import defpackage.bzin;
import defpackage.bziq;
import defpackage.bzir;
import defpackage.cabc;
import defpackage.cbzu;
import defpackage.cbzy;
import defpackage.cccd;
import defpackage.cccg;
import defpackage.ccds;
import defpackage.ccdv;
import defpackage.ccef;
import defpackage.ccen;
import defpackage.dcin;
import defpackage.dciy;
import defpackage.dcjg;
import defpackage.dcjy;
import defpackage.dcjz;
import defpackage.dcka;
import defpackage.dckj;
import defpackage.dckk;
import defpackage.dckl;
import defpackage.dckm;
import defpackage.dckn;
import defpackage.dcko;
import defpackage.dfae;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.eble;
import defpackage.fsao;
import defpackage.fuuw;
import defpackage.fvaq;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.ig;
import defpackage.jqx;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PlacePickerChimeraActivity extends qet implements cbzy {
    public cbzu j;
    public dcin k;
    public abv l;
    public dcjy m;
    public EditText n;
    private bzhs o;
    private dfaq p;
    private final fuuw q;
    private ccdv r;
    private ccef s;
    private final double t;

    public PlacePickerChimeraActivity() {
        dckj dckjVar = new dckj(this);
        int i = fvcc.a;
        this.q = new jqx(new fvbi(dcko.class), new dckk(this), dckjVar, new dckl(this));
        this.t = fsao.b();
    }

    private final void l() {
        dfaq dfaqVar = this.p;
        if (dfaqVar == null) {
            fvbo.j("locationTask");
            dfaqVar = null;
        }
        final fvaq fvaqVar = new fvaq() { // from class: dckg
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                Location location = (Location) obj;
                if (location != null) {
                    cbzu cbzuVar = PlacePickerChimeraActivity.this.j;
                    if (cbzuVar == null) {
                        fvbo.j("map");
                        cbzuVar = null;
                    }
                    cbzuVar.i(cbzq.b(new LatLng(location.getLatitude(), location.getLongitude()), 17.0f));
                }
                return fuvs.a;
            }
        };
        dfaqVar.z(new dfak() { // from class: dckh
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                fvaq.this.a(obj);
            }
        });
    }

    @Override // defpackage.cbzy
    public final void a(cbzu cbzuVar) {
        this.j = cbzuVar;
        cbzu cbzuVar2 = null;
        if (cbzuVar == null) {
            fvbo.j("map");
            cbzuVar = null;
        }
        cbzuVar.j(true);
        l();
        ccdv ccdvVar = this.r;
        if (ccdvVar != null) {
            try {
                ccdvVar.a.b();
            } catch (RemoteException e) {
                throw new ccen(e);
            }
        }
        this.r = null;
        ccef ccefVar = this.s;
        if (ccefVar != null) {
            ccefVar.b();
        }
        this.s = null;
        cbzu cbzuVar3 = this.j;
        if (cbzuVar3 == null) {
            fvbo.j("map");
            cbzuVar3 = null;
        }
        try {
            cbzuVar3.a.w(new cccg(new dcjz(this)));
            cbzu cbzuVar4 = this.j;
            if (cbzuVar4 == null) {
                fvbo.j("map");
            } else {
                cbzuVar2 = cbzuVar4;
            }
            try {
                cbzuVar2.a.v(new cccd(new dcka(this)));
            } catch (RemoteException e2) {
                throw new ccen(e2);
            }
        } catch (RemoteException e3) {
            throw new ccen(e3);
        }
    }

    public final void k(boolean z) {
        cbzu cbzuVar = null;
        if (this.r == null || this.s == null) {
            cbzu cbzuVar2 = this.j;
            if (cbzuVar2 == null) {
                fvbo.j("map");
                cbzuVar2 = null;
            }
            CircleOptions circleOptions = new CircleOptions();
            cbzu cbzuVar3 = this.j;
            if (cbzuVar3 == null) {
                fvbo.j("map");
                cbzuVar3 = null;
            }
            circleOptions.a(cbzuVar3.d().a);
            circleOptions.b = this.t;
            circleOptions.c();
            circleOptions.b();
            circleOptions.d();
            this.r = cbzuVar2.e(circleOptions);
            cbzu cbzuVar4 = this.j;
            if (cbzuVar4 == null) {
                fvbo.j("map");
                cbzuVar4 = null;
            }
            MarkerOptions markerOptions = new MarkerOptions();
            cbzu cbzuVar5 = this.j;
            if (cbzuVar5 == null) {
                fvbo.j("map");
                cbzuVar5 = null;
            }
            markerOptions.a(cbzuVar5.d().a);
            markerOptions.b = getString(R.string.significant_places_place_picker_marker_title);
            markerOptions.d = ccds.b(2131233783);
            ccef g = cbzuVar4.g(markerOptions);
            this.s = g;
            if (g != null) {
                try {
                    g.a.f();
                } catch (RemoteException e) {
                    throw new ccen(e);
                }
            }
        }
        ccdv ccdvVar = this.r;
        if (ccdvVar != null) {
            cbzu cbzuVar6 = this.j;
            if (cbzuVar6 == null) {
                fvbo.j("map");
                cbzuVar6 = null;
            }
            LatLng latLng = cbzuVar6.d().a;
            try {
                arwm.t(latLng, "center must not be null.");
                ccdvVar.a.c(latLng);
            } catch (RemoteException e2) {
                throw new ccen(e2);
            }
        }
        ccdv ccdvVar2 = this.r;
        if (ccdvVar2 != null) {
            try {
                ccdvVar2.a.d(z);
            } catch (RemoteException e3) {
                throw new ccen(e3);
            }
        }
        ccef ccefVar = this.s;
        if (ccefVar != null) {
            cbzu cbzuVar7 = this.j;
            if (cbzuVar7 == null) {
                fvbo.j("map");
            } else {
                cbzuVar = cbzuVar7;
            }
            LatLng latLng2 = cbzuVar.d().a;
            if (latLng2 == null) {
                throw new IllegalArgumentException("latlng cannot be null - a position is required.");
            }
            try {
                ccefVar.a.d(latLng2);
            } catch (RemoteException e4) {
                throw new ccen(e4);
            }
        }
        ccef ccefVar2 = this.s;
        if (ccefVar2 != null) {
            try {
                ccefVar2.a.e(z);
            } catch (RemoteException e5) {
                throw new ccen(e5);
            }
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        asot asotVar = dcjg.a;
        if (i == 1387388555 && i2 == -1) {
            bzhs bzhsVar = this.o;
            if (bzhsVar == null) {
                fvbo.j("flpClient");
                bzhsVar = null;
            }
            bzhj bzhjVar = new bzhj();
            bzhjVar.d(102);
            bzhjVar.c(60000L);
            bzhjVar.e(2);
            this.p = bzhsVar.b(bzhjVar.a(), null);
            l();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = dciy.a;
        dciy.c(this);
        getContainerActivity();
        int i2 = eble.a;
        aqxd aqxdVar = bziq.a;
        this.o = new cabc(this);
        setContentView(R.layout.significant_places_place_picker);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.map_container, new dckn());
        bpVar.a();
        ig hy = hy();
        if (hy != null) {
            hy.o(true);
        }
        bzhs bzhsVar = this.o;
        EditText editText = null;
        if (bzhsVar == null) {
            fvbo.j("flpClient");
            bzhsVar = null;
        }
        this.p = bzhsVar.c();
        this.k = new dcin();
        this.l = registerForActivityResult(new acl(), new abt() { // from class: dckb
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fvbo.f(activityResult, "result");
                if (activityResult.a == -1) {
                    PlacePickerChimeraActivity placePickerChimeraActivity = PlacePickerChimeraActivity.this;
                    placePickerChimeraActivity.setResult(-1);
                    int i3 = dciy.a;
                    dciy.b(placePickerChimeraActivity);
                }
            }
        });
        findViewById(R.id.button_use_this_place).setOnClickListener(new View.OnClickListener() { // from class: dckc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlacePickerChimeraActivity placePickerChimeraActivity = PlacePickerChimeraActivity.this;
                cbzu cbzuVar = placePickerChimeraActivity.j;
                if (cbzuVar == null) {
                    fvbo.j("map");
                    cbzuVar = null;
                }
                double d = cbzuVar.d().a.a;
                cbzu cbzuVar2 = placePickerChimeraActivity.j;
                if (cbzuVar2 == null) {
                    fvbo.j("map");
                    cbzuVar2 = null;
                }
                double d2 = cbzuVar2.d().a.b;
                fecj v = fhip.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                ((fhip) fecpVar).b = d;
                if (!fecpVar.L()) {
                    v.U();
                }
                ((fhip) v.b).c = d2;
                fecp Q = v.Q();
                fvbo.e(Q, "build(...)");
                fvgt.b(joo.a(placePickerChimeraActivity), null, null, new dcki(placePickerChimeraActivity, (fhip) Q, null), 3);
            }
        });
        aqxo aqxoVar = new aqxo(this, (float[][]) null);
        bzir bzirVar = new bzir();
        bzin bzinVar = new bzin(0L);
        bzinVar.k(102);
        bzirVar.b(bzinVar.a());
        aqxoVar.ae(bzirVar.a()).x(new dfae() { // from class: dckd
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                if (dfaqVar.m()) {
                    return;
                }
                Exception h = dfaqVar.h();
                aqyd aqydVar = h instanceof aqyd ? (aqyd) h : null;
                if (aqydVar != null) {
                    aqydVar.c(PlacePickerChimeraActivity.this.getContainerActivity(), 1387388555);
                }
            }
        });
        this.n = (EditText) findViewById(R.id.edit_text_enter_address);
        ((dcko) this.q.a()).a.g(this, new dckm(new fvaq() { // from class: dcke
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                PlacePickerChimeraActivity placePickerChimeraActivity = PlacePickerChimeraActivity.this;
                dcmm dcmmVar = (dcmm) obj;
                dcjy dcjyVar = placePickerChimeraActivity.m;
                cbzu cbzuVar = null;
                if (dcjyVar == null) {
                    fvbo.j("placePickerFragment");
                    dcjyVar = null;
                }
                dcjyVar.y();
                EditText editText2 = placePickerChimeraActivity.n;
                if (editText2 == null) {
                    fvbo.j("editText");
                    editText2 = null;
                }
                editText2.clearFocus();
                EditText editText3 = placePickerChimeraActivity.n;
                if (editText3 == null) {
                    fvbo.j("editText");
                    editText3 = null;
                }
                editText3.setText(dcmmVar.f);
                dcjy dcjyVar2 = placePickerChimeraActivity.m;
                if (dcjyVar2 == null) {
                    fvbo.j("placePickerFragment");
                    dcjyVar2 = null;
                }
                dcjyVar2.x();
                cbzu cbzuVar2 = placePickerChimeraActivity.j;
                if (cbzuVar2 == null) {
                    fvbo.j("map");
                } else {
                    cbzuVar = cbzuVar2;
                }
                fhip fhipVar = dcmmVar.d;
                if (fhipVar == null) {
                    fhipVar = fhip.a;
                }
                double d = fhipVar.b;
                fhip fhipVar2 = dcmmVar.d;
                if (fhipVar2 == null) {
                    fhipVar2 = fhip.a;
                }
                cbzuVar.i(cbzq.b(new LatLng(d, fhipVar2.c), 17.0f));
                return fuvs.a;
            }
        }));
        this.m = new dcjy();
        bp bpVar2 = new bp(getSupportFragmentManager());
        dcjy dcjyVar = this.m;
        if (dcjyVar == null) {
            fvbo.j("placePickerFragment");
            dcjyVar = null;
        }
        bpVar2.F(R.id.search_container, dcjyVar);
        bpVar2.a();
        EditText editText2 = this.n;
        if (editText2 == null) {
            fvbo.j("editText");
        } else {
            editText = editText2;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: dckf
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    dcjy dcjyVar2 = PlacePickerChimeraActivity.this.m;
                    if (dcjyVar2 == null) {
                        fvbo.j("placePickerFragment");
                        dcjyVar2 = null;
                    }
                    dcjyVar2.d.a = false;
                }
            }
        });
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        fvbo.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        int i = dciy.a;
        dciy.b(this);
        return true;
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        int i = dciy.a;
        dciy.d(this);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        int i = dciy.a;
        dciy.e(this);
        super.onStop();
    }
}
