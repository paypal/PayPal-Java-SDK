// This class was generated on Thu, 29 Mar 2018 19:06:15 UTC by version 0.1.0-dev+2136c8 of Braintree SDK Generator
// PaymentCreateRequest.java
// @version 0.1.0-dev+2136c8
// @type request
// @data H4sIAAAAAAAC/+y9a28bOfYn/P75FET6DyQOLDnJ9GWmgf8LxXY6mklsP5adwWymUaKqjiyOS2Q1yZKiXiywX2O/3n6SBa91ly1HrnZm+EawSVYVD6/n8jvn/M9nZ3gJz35+luHNEqgcxhywhGeHz05AxJxkkjD67Odnx7pYIIwETuEQYYpwLheMk98hQfZhJBmaAYpxJnMOCUqxBH6IGFfNGU+AD9EVQ+YTxavse7D6lG6tmx4iQuM0TwDJBfgvJCAxSQUiVBf/dXJ+hjj8loOQaMaSzRBNQOqqKaESqJyqTk3Vl6aHaOr7PNUfmuovTYfon/mrV3+KZymLb3/LmQT9v/mNheSM3piSMybhZ9v6qFxxdXGBjlMCVAr04mpBeIIuMJcbdMHZiiTAfZdjRiV8kYjN0cXk5A3icJOnmvYDhDkgDkJyEktI0JyzJcoFoTf2kzFLbNc8IbYvRQ3CNGk013Q2m5ohEkNbU6cfje0MZHijJkRyTAWOVV/dRKiVkByiOePoAm8ucOpmSiBG080h4pAQDrFE15cfxBBd6RFYzgjVJKtR0JNln4qWIBcsmWoipvOcJoTeRIQKyfOlns0EJPAloSD0g3KTgXqJX4ELLBERdo0lQ/SOcbRkXNE6Z3xpF5kAQJ8vXE8vTydXaHQx/vXFUcJicaSG5Ybrpkem90eOqqOD4U5rpWWpoFF5wQs96Tc55phKUJPOOMoztWrlggOgBG/EIZILlt8s0IblKFZ7T0pYZnrD2d1W3pFmaIsXvfmLfssQjeYSuBk39e5BgjdowSjjKANOWFJ7A3zJCAdx6D/7mRcL79cX31VaR6W6g/Ke7Vpdzw6f/f858M0F5nipZlU8+/nzr4fP3gNOgFdK/+ezq02mTim1NejNs8NnnzAneJaCPb3M2huoLUeBD0ZScjLLVbcG4+TZ4bO/wca2bJxszw6fjTjHG/OFV4fPLgEn5zTdPPt5jlMBquC3nHBIfMEFZxlwSUA8+5nmafq/fj189o7xZZ2SCywX9bJLc1iZr3m67FA1CSsqChKKsiolIz/i6FqoKSYCsdm/1OaT7tQ9RBlnMQizcdESU3zjZ0oMv3IwiokaZVlKYrMw7InXJA63NioIba+vEm0oBVRq649YDoLlPAZNfi4kW5Lfi6tknrK1WuLACdAY9H7ZsJyjWb4Bvsex6Fq0M45pElH1T5nqSnF9hlM8g9Sccucr4Jwk9iCcqXsChEDqQXfXfAQeLzCVz4U7nXEcs5xKxEwDWxovIL5luUQZvgExPF5gjmN1VKRAb+RCL5WULIk0R9bP6PWbn5C6l1IYzDbqLk+zBab5EjiJUewe/+ox1Jvr8M6BTLG5J1TvK0NZq6gO5lXp+rANNf1qtSREZCne1IZJEGmWSS6A+0HTPE1ulyFldFAb6vK71c2jd+P0LUlTQm+mlafrT7IbQjue/6Dqpn0NMItxWhtaV9QcVFNlbuUbvTyxLJPnNmBp79nxVlcUWuGUJOo3B3WTT0fXinMbXanft6f691L9Ho/073v9e6Z+T3Tt6UT9/vJW/b7TLcf62bMP6vfC/OqSy2vLBl5PpurLPwz80kWKS1Kfx6lgtktq5lNMb3JNldliQrEzOZWcgPgZTRMcnfxNvXoB0Vh/iSTR+ET98S8c/fVC/UFZdHau/shkZCjheaS7MhWraKJpkIvoShP2+yIytP2+iN7/zXb390V09fe+5l4sSJbpTcRhDlxNl6ishI4G1XUxySAm8w2a2MboomhsmaQ8LXNSKSn/V/CsZ+fR5P344mJ89kuTn0WXkOBYCuT6hHCScHUqzgmkiTAcdWUpqvMOXULMlkugCbiFJ82mVFOekBsicYpuGEs8q1ztXldnfzm9it5dnn+M3o0/nDa7+yKBOc5TeYB+sUJLo98CUtCywGxjj/kNcHUsVQjYqVOT06vo4vL80/jk9CQanZxcnk4mLUPpL1bbk8wIMr4nS3u3DNFb3SciEGUSqZWj79sFpjfVN1QPUzv047l/E0oYCPpc3UJCaH7WPmiIXmBz0zG9psw3GBONb9w9MkduqfW0hdR1ERm5qbJzquXVDXMCcy3krBcgF4ppZyjjIIyM49bBmqjLGaFjRiWhOSB1PKgBQGdsjYprXbE6QyUJNaUU27hNTqk8bm4eVOryf6s9QyQanqsTfOYWgRP4IDEyTOPYN/cY3q0vs1xKRtX7xYKtaZnDNcthvQCK5oSq63Opb08i0C1la1vliSHq6CaSKPFQMzZKuFljo72wzLHvK1kuIVFN0w3KM0YtmXFK4lt9ipkeGzGzSZCbl3uObnVw7ZT6Q+LrxnnS3a3J1w+02vmlwVZD6gbZKD3KxDZG3esIipVtSfJHg2bM1HLXXKqZJTUBZTlzL5LcPbazkaQiSWqMe7W8yRclWutFE6RamIEqq7bW2KstDhV38XlMJXAKsvagUWP8+mIhZSZ+PjqSjKViSEDOh4zfHC3kMj3i8/hPf/rTX74ToFfT4Ifhjwc9HXYFVxdlnM1JChGpiuBdLZojZsX6G6DA9X4dn+grubw0nos2htK+2GzMpurHqiDXMGt5yKmBcEac3mdQtDr6bg2zgW0qIvOmvgZ3jkmac4g4YFG7TBpVzeE0VYa1VcOIC1nYPNwTFbX10DH54xOnHdznBr9H77RStNpDV9Tspb8pdJMh+mTllp2YWoHTpiJ3iD7iW9CMkL+G6jq1+3F83criIfrstJFaue/XA+Nesai1+PdRjdoHBrbAq0rv2ct2HfUQffa2B2tEuE9fdEPR1QXPAO6yoiTPty+olNDbKClWSGSUby3iNKG3VRnKldTUPRRh1Tu1D6yRY8Ah1Sfh5/ejq9Pz0QTpR8tHFlsBXxFYH323wBIYFgPdpH5E/bh/hdaCw7xCli1o7pqYLbMUFHOA+Q1o44BWhCzxrWEYHJkxTtNDazEAe+7LBUsM66v5ks/Xl2N0BctMPTEwJ72E5M4L8scffnp1oIfP3BKZWrqes6ian6b/pWTwF1OjNZ0eTMtKLm3UmCpap4oXUu1vYYPcBClaGfXGCT0ZCPshMDQ6Vl7kM6Fmmkpd3NORZ8a0MnW+qDl576+uLtw0cPt1xbC1Tl5PFHBIK903/zf7/lkNv+mgFiI3Gdy5UH74y5//7Dmp7w8O0XpB4gUSwFfqVNIHk2VMsJ5eM9E5xcsZuclZLtINMufCzGprBSwxlSQW7oozy3CieJMP6g2Xtoei6N16vR4STLHuGxaC3FBz1qlnB46k+r/DL4qMg96YY8oUC8wibTKsTEm9pq7annMw29coa8wgxtamGmNqtKQMCaAJwkrkACcm6FfueaW5bjYNMjW62um58t1C/k80z2kiHszSNC+g4kh+Z0ylaOxNpS3MY8OcWr2E2uu7ryRsTQDIPoiKBz2XHuecG2HUWqY+aVUqo+lGH6X+/PAPKGFQHX68gBWYs8YMpPn6MhfSH9BAtIYEo6l5OFIPT7WmtFQQSXYLdGotYlrxJP37lLSNCRXGVCwXitWgUCLosCKqEYESiFNCIdnfrVrqa6vMWaqsyJyl8roKKeMQGzP4VW1orfl+iP5hTbu5E/NLkyiZntqCLzTagIJN1K9SDwBO9mcvs7q8FoOZsZlERYOS1axR19yPtk2hLOQtiuKyXPT4NsCYyE11Qk1BC8tE5EYb93q6UY1ZYxMpVrzaw2pFyx0r16xkSRlPztGfXv/44+C1ljy3cO8chDyyrx+otuLowCI6EqCSzIm9Pm0bNYEcbgijXw/KuCq91gvIvyjJA73lRB0Oatc3FPxv2/E3lMlG2+u/tbQVauMlzl4rWTZIYQUpSthSfVLNt7Bno7oNTQeHXjk/PX4zbXb7eEEoRmvG02RNbJliNzHX2vmcquOOszSFBGWcxIBeHF9fHNhz9hDNML3Ve9uwuzFnQgxmWqQqY4DEFmTH/qSqTpskofC6LkTpkuaKnBMuNOcNjt+y291w/vAFK178ENF8OQN+iITkANJQLxhidNgbSW8aJL1pJUlAzLRV/i6aRE4kaAxehrnUx7Yhs6dzhCqBLHUgISGxzEWNL2xt0CTZHdGVB5B5YIguQeacguUt1JLXPJe1+b3l+HfSlzCSLRitnpmupIVHVDV+4RGKPp8OX7/5U0PLq7l/mQ8JVedkfHQ1uDw9Hui2gzevXr1+9WYwPgJ6MEQf8ReyzJcOu0EE+uFV/5iMjAmJ0+btUS1vGQ9dr88yJ2hZmfp3kpkjTq3u33KywqlmSa42GVGS5qbKTHqzvBOtS2+2kNTyW7ToVWpSjDzQ4ZrckgwSYmQv9d/RRUFHX8pftdKrg+lKWu7g+1y1+nF/0RrO53qid5QeIjXqxRjpBkyz2n5s1bYrM/ClywGRyqlk7G6aqzbHVRU58XnEb9QVT/Eunf4Ou6cODtFns8d3en6mH1EPH2OKk90+HutH1MNjmpDdniXqCf2oxOlmt0fVE+rRv+IM050e/Zd6Qj36Eb6QmO307FI/oh6+WmCSYprs9Li0Dx1oCMvna0okJGiimoidXpQL3HrIff+qgkjr/cCTqrq8OW1BN+is/b6evj//eBqdX0Z/P7/UUKJfxu+upg/lRb7KzrlaVbkRW9BCkUYTa3mR5XygETNGONTIKYfKTPYtu+gF06alMcjlaMmoXNRtj+WKJim6gemwbmRuD8pQClgrOX4Hzgozj+Eupq+Nm8HrN9P9cop3EbgBzNvos+UtnHAxPyVKVfN+WFzNiTcxr5XiFtlXLaUFSxPgz4Xl5nsUhVPc1udy6V1dVm0fo8fB5BRMTsHkFExO/9kmJy08V3UKrqjlHChpwa0ipLjNmy4MRp3gmACR4Ri04jjLaSxzTfAQfcyFRDHTMCMPXWNJnjLjOmGYVL9wZxsEOF5UuqKWxRC9NABmoxHkIDJGBYjhy17u5vtzsM2O+xGcrojA6uRaYiGBa1PMIZomRMTqlrAIdryEL9MhOmFaU2rdHwSglK3VMwIMDFtYALZ2DtgHg1JeTg3b0Fari2/SanvxtS28sarRXrJ7sL88vj2iRBPpNDVFWyFbldVh/TGFZLzQc1uk6grnqby36n68zBiXmMpO/b0aQ3u42S9oz866It6jhJr6+NHFWKhhx3EMmWwzRgqDvXU+ukNtcQWcFE6S255V58g9kGEYqav9v//57G6g041m0fy//3xmDRPaI7pGKLZU2ou/9VuKndPzcvSdoWCgJ9zAHN3bd5vh6tfvgQnzXSrfQzOOCZUcwDsrxmx5lHGW5LEUR756YEbIdfWtK0cnpnwvncnwJsOp7kEujtYww1kmjpZZduRgqe77diC8e57r8D36cVRdIo9rZvnWRemvVxb8UbL018ml3zdk0u/bnfKUBKp6bPyZPBdot20LV9STnQBvgNevmlJhHSWUU/Jbrm8affD4Q1czpwYkz3F8W/ghaAKV8FOi0B5S+nRCxp8TYfNvdSyUoEWE+pr6yAJS7U+PV4wkqica80sYxam5ezhaEmFvodJbhDGjYopmgDDdGObmEIk8XmhmHl1fj08OjVspxUvQTBIsMUkLJeHLl264X74sqOvsuf4kmSOsYyvo0ZxqFwPGyQ2h2l7iXbr869yLakicJ6dCffoMaLdA82sdZBaV/BM6Nwids7YtYoo7oGdlx4cAzwnwnADPCfCcAM8J8JwAzwnwnADPCfCcAM8J8JwAz/lW4TkzwuUiSuqHTqW4TcjicmEiChTe1e5uq0YceHCggdqIvf7LX14NXn0/2L9Kb//CkR6M56IpJL0aeCGpYOd3FJb6isCwxKRqmnYl3fTWlE3N/fv6zU/9b9qHoYUcTd8ETsh19rEQQp34C5IkKTR7Wy3v7q9p12ePd9MUl8KHGN0wJAhozDeZNAGL1a4+6Ys1xGkucSP+U6W4e6iLZvvurovc1qnSa2nREvhtm1KvocFzlu+guwu6u6C7C7q7oLsLuruguwu6uz9Ud8chJhkB2sK+N6qaA6tDbtuTwjdHOugxEf7sCFrIoIUMWsighfz30kKKfD4nX6oHjivaItLqJn0NOv5SVxv4ou4uSvwFjU+GaJJnGeOyFKKoFmfXuqUo3qhXgqLmYqqU30WaBU71Tt+v99P1lNIBtWU/ibZ4C9XjRnlsWF1uNDDepuxobjk7Dn/HaQqyFnkzwNUDXD3A1R8Nrv51/G9NCt4i95oqm0BMn43VFCx7P/BcqPMo56lok0Oq1WUxpFpTx0ULkMZnt5RurYBIW6RvKU/bYIZFkbmvD3UspjGkqvtVlWe5uDlB15cf0HoBHApTZS34PdY5zRZg4KKAzAurURZL4OlyqjqXZ8cNwsuXvYmbMue0MRaV4n2MBc7UxMMfORi/7llmtXJnJTB4Zw7Jsqz5wNDcNiJ/S1xqzaWXMiKuseJr4xiEmOdpuvE5CHeL1W2mrOuDJjuCa2Q02yUad/rUHJP0XpS5BJvmgT2G1L57B5W60cIHlzQJVUa4WtEd4sCF93fu4xUVPBrVMl66jCw2nVUpGqhmGGmC1guG5nk6J2n9BHqnszH6TA7wBeK8iOeu/daFCTL68uW03I3py5cui59h1YRrZdJvlOpbWPSvCLlgXt+Stc+VlxL1uaJuXtw0OTTM3ENsgNui33beOTr6bFwzAxaFbQY2HcqmYmIbfP/m9U/IPXY/S5tt7JEf7pRNGJhsKcKIXQinqXs1AbFfY4gZ88iOdnN4iopidIqyVisBse5OLg8vnrG8uhvMRx+fn7ghcxmtOc4q3S+XNglQtUjVojlAK8qlrM73SnITlWP7vTGBFVDnWzeDObPXdAIxWSppmpG70jZc7dh8zdz3sM/reo/nH+mk7ozQgmmiXX/mUL3jaxXN2XINwmSpLj89NRShIueK267lSilKm3Pqa8OkVibVW1Y7Z7bndI+tSJ/tCJ8wo70pORzySnu11rmxttrt04Zcy7Ajn94xK/KZZBKnNRuLL2yZWlvpEvQ5UoiEpfCZD5xU56bSAF50m0Njuc5MZzdqFbx8yb37edjlfZl56uaddlMh/hJmpCdVVXMndm/Dyh5UU3FT5OrM8AbApdK1eWLeacylzhFziDjYdK9G3LdvkSXdA4Br7V7qQju4F4Y1sc94Yd1KBiHZsqZisEV35TjyWW90mqPnGrLa07VSihpaUwCUy1sUOjmPF1gAKjXsTeBYMRJD1BLwr1HVJnroJhYQqPeMjhRjrrpHSTGpLtMoJaJFi1auKpFRKu3WWuo72pwFmAOagWLj3LzsMRGP+k57z0Wj12J/PX6EMLFPRxH4tDe3mqfKxkZPUERtQDQ7gZmaHO3Y8VQ82rRPQBXPYks6eh8zIf0sCCTVpejuwBTH0FfHf8sxlXWPmlJhR/ddCxsjdQYIo/WCpdAvUl7c5lXxSf/fZl1k8S26BdCScU6JRC8mf7s+qIhQw6fF/utx1jLAE9yrdRP3Ntu2ZIaWctQqNFphkmrfmnKuR+/VU7LPLYiQjD8CRi14yQUvueAlF7zkgpdc8JILXnLBSy54yQUvueAlF7zkgpdc8JK7L8LZCYEtDk3Nui3yoTU/a57dcOWF8roIKH49uZigC8xjSHuGjUSanWjT0He12EJsgzUhUqAYU0bVfYuIjlaGLSLR8CuKegPUTZx1TfEzP35/13WqGx3Yj+mPp5gO0SlVRArk/GS0rU0sMLeKiP/7v/+PQEqawbFja811b5Uu3sCj9cCFFxkyUgHVl33lafeE0XOsF0ztSCwEi4mGKNssZFXdx5LcLLR2TYf0VxetjvSOEjKfg/6wZkK1xNY6EVNk/EEYLT6uabMfYNRS1F9WJyYhkizSls4av16tqa6g88wsiCEaKSnY640KlsPyIMZ0qgVfxeCVUPR9ySWSzDcNJ5BKcaeiTAD1zjtIP0Jim32rn95rYbzR+XJpe9/tAnP7CQklHHr4PXtMa5xbLy1xxaARVKzbgxb0puQQA3GuNWYpqWulAv7Xo/H4Krxd4v1V4vy1HiuaxKYjnL5ZMUUm54W+c63PDXh3G+O/UP3E0qn9a5/COl8a4UtIUN3psPubAqt7vfhKrIQoohjpreCFt/f6fgZc6KuE8WZftkIVzlgHjbVBfAqoIrfz6i7x1fKuYHreTcxmH/Qr5jH2amQTbyjOCCdY4o7N29autpvbmjRptI0GWoPjWu6Xzru384xjmjQl7Epxt2+/X7iPoKl3Y+iUSXWjc626ZHau1XQcrM9FheXrwfixPxNDR3xYx3QmsIJUda3si72TGaIUrVcNlNPE98Sr7JRik9CBG4VW7eKP39f47PsrG3/8fvDm1etXr18Pxv0lGH34BVth5nsCITQyDOlwGSxz3pAdoTaKBs1YG0Vdt4OfbVNIpXvkqO/eyThN2RqSaEvgkM4mdwUQaSfJZAYzMD7v1YezLN04iaMlpEYjJMlOvsjXZ5enk6vL8fHV6UmL2+5Hx1P77izwChBGGQctBcag2O8FW6vubdAaU2mFUyHZ0mDiMrzZzYt4fDa5Gp1dRe+uz07GZ79Ek/Pry+PTbd2zWnJRoFl9BzK8cepyqjOhqvaKu1YnhWA5jytp08ojXHiyz3CKaQxDNErTIpaJFtlNrm1t79TvTjdD9J6tYaVOJ99U98v2EmG0xDTHKeKwIrDW71lifguJ6kMGum8FdZbj1b5r1lEfbPe1Lhh7bW7JfVjN1QakT9C94wx8/Hh6Mh5dnUYXo3+0DPyFpVpoZ9MiMMxyCYniVtUgjOjGd6hMvmjQT4Qjvzd38HtFDLJgwkhLItVTrF61BdRqbMxWFcN0iGg0Ltv+H0067Ta62L1bZ9hrFV1akKuStD3wGf/K7LujPadk30RZwT7iYDZva8iTZpNKUvVG7RNw59+fk305cEXLtVarLt1mtZoWa3W5xf4BRSE8QAgPEMIDBPeZEB4g+K2G8AAhPEAIDxDCA4RjNoQHCOEBQniAEB4ghAcI4QGsPkFHAY0kqdlzq+UttmgXKlK1QOsFGOBMVauzxsKFGW3L4Okff3Aqz/0eZfPlvFvdUK0sZXuslDcH6h3HeYI+YopvQN/B70iq1sOLdx/fHXhNhPc9x1mWkspOKyu9RZ6qKw/5wOiHKAG60Uhbp8h3BiDv8KHa+xdxEBmjAgzPbnX9Hu60wAKBxhQm6N3Hd87vKuNsTlJAAqQk9MZgiQqAN5prGueaMKFnXXJycwMckjJwj4niFebAWKqNWHKoPEQCAH3uGDOBJvlyiblHUccpFoLER/PlvKzMGtzkJIGjdx/f2fZf79j++dF82s2o/QHhKsyH62r7cmlnZ3fMTPlghy/bmQbgulre2U2dQaKXjt7f5992bW/wl/uc8bUp7pjb8Yl3lCsf4ntejSmht1FpsUcmOHCrs9+tqDv73W43sFihwBtYPr8fXZ2ejyZIP+pODZyRI7YCviKwPvpugSUwLAa6ycHjx/pYcJhXNYmmoMWj2ZpbkVTMl46ZP0RXDC3xLVgZyJAZ4zQ9VM1nSgYyB7qW8yxqkgj0+fpyjK5gmaknBua8lZDceeX++MNPrw708JkDO+MwsGZqQm8OHfdloNv/NT1E0xfWg2F6MC1DR7Shb6ponTqHtVvYIDdBilZG/U2nJ0ODIM0QGBodbFHkM6Fm2gam7islcROzsQWj8f7q6sJNg/e7kx2T15utth7Qv531/6yG33RQcXHqGL1zofzwlz//2fNm3x847lwAX4HQcAjqrLpYT6+Z6Jzi5Yzc5CwX6cZegjMLWxawxFSSWLhzySxD7Yn4Qb3h0vZQ1JBZmBrPCZNZ2aRyUc8OHEn1f4dfFBkHPeYP4kClg/rUME21qm0HtQc3UTvcdRiQ2mqzfURdun8SbANeari1Viu2YJq0++nj30OdFBguOuKARY2Ta1RVqThRMm+sUyrow840K6IOlME25SnSwJshOp8JpsE1OnjB1DytEZ5TDQcCvO9JtOc445ETCtoCArW0KUcHaqlumVzXrEB4eDlE25jNYeC2v9n9+WxJpCySwDQCyHihc1rFzOkLZmrAV1GMeTLtAeCXrEgMTaRutbw5Ml7yMg09AI45iFYCcaqBIHOtX4lzbmCpe0qMc89dgVeihbaisOUOGVmM6Sfg3vsHTTZCwhK9GH2aHNyBPnZpoHxlVeRTTNzo0+TSLqNjC0OuLKu+IsGsVi0Q7aKwZXCOP316FPKFGd8/YhQgJpHfs1U0cq3mXudDVZHkCOqNUTKfa05rvabTEcUF4agfdaWgDTdAgWse0Hs/+oF4LpDIIFY75ytm88Hy7CrDVdnLFtxr6j4RoV2LgKNRLhegeDi7/ZXQFQN68eliNDlwoUl647o4k4ZBjSAlN2RG0np0qc4mTcJNHCI2RwLSFJRk5B5FVvftb/0KLnsnG93DgNinH8a/jN9+2IpyNgYyaRJzzTa2E88FmhhyLgpyLlhKYmPfv6berU77pVnsMk3QWJ07Z0yiS+N5uGNeqYvR5dV49OHDP6LH63yji6iLIiPrWt2s0UlO25eG1kFNd4Wk35NGymSJzpwm1ozQReWTsPttGad7bLXozlgKO263atijEsvY+vlpxWo8dfM0VStl2lyj0x23s43Cxo/K8+P/NV0VRrHO0YzJhZeEjHMIWqnjQNzxngedGeOr04/R2flVdHl6fDr+dHqybSOaBeidFuwCxTdYCSooTjFZGobVBNZV65g/6Fi4PhtdX70/vxz/j9OT6GL0j4+nZ1d76Vhe3vaemX4K+6ck+NU4j3J5c3/sJm72FpEJSCabrgGl4jZKdDUan3hmqRre0AuEPnPy6x8H2tiKaL4ETmK/+8YnPqC2zazL3YGgBknn+0W56C94zMP8JWpqn8IdpDK1OiCsDYTIDdfozOtE1Djq/gNK7BLUqtrXPpesSYLYtIdXy7/CHp5iteL0274Jo3iniIBTkkQ5lTXf02r5AwcKvmSEg3i641OWN45xJnMObTmFXUU5obArazH4mLqaH9C/t2PMNx4vP3jGBM+Y4BkTPGOCZ0zwjAmeMeFMDZ4x4ZgNnjFhlwfPmOAZEzxjgmeMU9la1c63rPDbFUXeos0KiTjbCZkxlgJuCbBDRKSjcEdtqsSWyio1Y5qQGEsdRQh0OgfJEIcUsNAmRcRhiQlVzOJCp3tVh07A+we8f8D7B7x/wPsHvH8vYIUK9FtdVZtG/ggTm5L4eJYmseEKeH+U7mK9dpyPRfY/CI9jKW3BuJS/UAzJbrgaf87e8f4FFkjksTr+53mabooDerfvGYHmzs+tsUDmO+6B3T6TYS4JTtNNtMMH/UMP/GgClLR+yGqYFjrni0bx6xvBXqfNkL196iZKxtK6JFz0qGHaada1LH5nT1VMQUlRhfuNuPwfbiLegtrIoY7XyDtAOMbii8ZOkagvaYNKh8RHoZ1XpXknyQu1G7FkRcqgz10Duj310XhyHqmnvhvFkqwM8l4cDHvSAuwZD+QCxX5DUKDyKLkQxW3ZdpqZdloHppEmN8R+DcdXQLgEhEtAuATTa0C4BIRLQLgEhEtAuASES0C4BIRLmJGAcAlr4huJ/VrRbYWwryHsawj7GsK+hrCv30zY14ZmPkDBAhQsQMECFCxAwQIU7BFDv5Y7XQ4DGyK+9jZ3fUXGIxTBfA5xe7CubztA2S1R0tHuVPcYoszbaqqqYTFE542YYwJstDEUY4pm4AMnhbBi/6lhxb4WqYtOV0BljtN04/T0mOMlKMloTbQ/Spbi2LKU1cN3WrS914r+BqN5FeG7iGKbBIuJZhMLVt4ITLWbww4CoWgaYy4jdelPnyAqugn8ejx8tPlWSQ+JZrlElFXDTIkjiwMWaA0c0BIn4He1l4h3O1qK/b+1awsszLTNACgqHhqiM1ZBJ++jT/Z9d/dIiV+AhdRKPo8xp0TqhbhfiLn5KhGFrIu12Hcn7WY/1D9Xd4ZrfBUJkEoKqz94dXndduSfMaOl7Fow9lKsdVHt0d3nZ8VIcsc4qeEwzR6naz3fRgFVW5YVjTGs9XYx5ZV7xRS13dSqKgSMC3DaAKcNcNoApw04rwCnDXDaAKcNcNoApw1w2gCnDXDaMCMBThvWxOPBaY0Crm4KqBRvMwQInFaNKTNQ17KPStFTNsN9g4K1VuobgwTvG+3pdXMF2tOaPZa5kGgGSBB6k8JgtlGjkWYL7DLZlIBUTzPOn6WtYtJuOXB++gMo2UscQJNkJ75Ve9GnEwrQyACNDNDIAI0M0MgAjbwn9qYFdrMNceM5/HrH/wimULGmdb62KHv6TO0uOBUDYaowN8NgFe/fKq5WTvtKbCzD9nmsr7wQZyoYxoNhPBjGg2E8WGyCYTwYxoNhPBjGg2E8GMaDYTwYxsOMBMN4WBOPZBifkVSLMfiGgw7sU1cldjTYple0jyD/iPWFwwJ53zs16/AF4lxCM9tCT9b0FLCqabGn12rurdaz1y0cLyC+rWuH4UtmnFMlQ/oL37K1fa8Z+AROn0D6vQeHGoIv8QLTG4h4XZNdr2mOh2uBVAvL69R2Q80JnVAUcybEwOv0cgEoxsLkkuOAcBE9TG1FgTCa5RvgJuwYZXSQcbLEfFOoBc2HsTQNQxC3EMQtBHELQdxCELe9orHqVq/9jmHAKQWcUsApBZxSwCk9XZzSnYf4pV27lxYfIrqDuS1YmtgAPKI1qFutwbbDXbcx68ZlRmRpIux2iklG1GBouA2agKwwuW6o1BMaoJMLHf3q/emHk+njn/ot1N41GndCux51DB5z8ZdINb3oHgpf3zYUZWotPZ2x0EptNM0LSJPptxvYsP8AVvbWZzxyQmRrYLxmm0o8vGZ1C5zJNVOcxookkBRyq8b6VMOImbsiny2J4mh8fv36CJWi4rlR17ezZkemMYeEyCjG/OtXxd2nAU5WJIZmKLVqeXNkvKRuGqpzf8HWiq3QOA5wWWJNKDkOcc5VB/qOaYZXooW2orCF4xglCQch0CfgZE5iw3hMNkLCEr0YfZocFFd8AitIVZ+GGd5kOB3GbHm0hhnOMlFUVlUEiuUffZpc2mV0bBBj1WXVl0pytWoOTqmwZXCOP316FPKFGd8/YhQgJpHfs1VlZK3mXudDJZCVJ6g3ttp8ri00YrWmSYs9s6kSyFId87EyG958JNANUOCa65pztnSKOTMQz4XLqht/xWw+PCVwhqtXuC2419R9IgKrYQCORrlcgOL47fZXInoM6MWni9HkwF3wvbEpe41o60/uUlBXE+X2jtCuTyZQ5WMFvW0bGdX4ATFvO+Pd7i/MbU9jbQN6RjklMuoMEbq12Ta5scxWal4qZtycG87QTcTX6QH7DTM72m+Q2ScUHDYGkslmaNhScatgpKrR+KR0fRQ2IO+B6iPFurjMmtIbDVjKBXC9FEiiTuT5pixA7pn6krNAG/0rVRC1eES01bZoUZ3xENOkDNbC+1zbwU3ioawDTvPqPnclLa4RxusBjR2YTgt+hu+BxC1qNq8iWhyaRUCGOZaM++vkc9eAOlYb6HBNbkkGCTEKRfXf0XhyHqmnvhvFkqwMbyf2YsP/dd9+aHX/JRMuea8T2715Sx9u+CU068LGDRv333rjBtfMX+93wLG59AZiVo250axrOfTYXKKijeJhcqGBfAYeapjbeW74PjOIHq9tOvVclOCcNxoqppklM/JLi/jEacrWkNimh7pudDFGkuc0xtItc/3G3qTWPa8yxzOqRfYtuP4+cyou855Cee3NabXxqgxSi1zhtcnXAsoZFPR60ivj0Ck1jNl7qWFLexMUivtplGWp1YxEMaMSvrT5Dbc2KilhW+urRBtKLRbNqmJs2+LUUeTnQrIl+b1YJfOUrTV+lBMNnlXn9Ybl3MD1egjSPeOYJlEDjlMprs9wimeQGlHofAWcE3dBzXJBKAih0ToOC/fRaiueC3cb41h79RiMm1foxQuIb1kuUYZvQAyPPS9gDxa1VFKyJNIYoH9Gr9/89IQiOKXYZE5Rva9icKoVLRarTaaBgbahpl+tloSILMWb2jAJYuGkSt70g6ZRLrldhpTRQW2oy+8+dFkZpm8Nnntaebr+JLshtOP5D6quL5NgyuJ6GAJf1JIPS1epYdXLqXBRqDlOlfaeHW8xRCO0wilJTC4mrQobXU8P0XR0pX7fnurfS/V7PNK/7/Xvmfo90bWnE/X7y1v1+063HOtnzz6o3wvzq0su1ZsZR9PryVR9+YcSF6x1M0QgnApmu6RmPsX0JtdUmS2mNdc5lZyA+BlNExyd/E29egHRWH+JJNH4RP3xLxz99UL9QVl0dq7+yGRkKOF5pLsyFatoommQi+hKE/b7IjK0/b6I3v/Ndvf3RXT192nP7p9R5lV2ot25sNqgui4mmn/eoInzMbwoGu+UB+fsPJq8H19cjM9+aaY8QZeQ4FiKwpURW0vdnECaiMIY4ZeiOu/QJcRsuQSagFt4lg9TU67ZfJyiG8YSsVuik19Or6J3l+cfo3fjljxb6EUCc5yn8gD9AmaHNPotIDX+DdYxyGDOGa0SsFOnJqdX0cXl+afxyelJNDo5uTydTFqG0l+stifeBGJ74jThQ/TW4OCNlKdWjmVf6U31DdXD1A79eF7o1JWoSJ+rW0hoBJZ70BC9wOamY5nRBKtvMCYa37h7ZLw/UF9xbgTwyGgAqmxupbyea3GuTePrBcgFaMHAun+V1oFFGKJjRiWhOSB1PKgBQGdsjYprXbE6w3eM22RAQnJmU0mBbWwHplxTfdzcPKjU5f9We4ZINDxXJ/jMLQIORi1Q+AXUjn1zj+Hd+jLLpTQAMbFga1rmcM1y0EKAzojktC9EoFvK1rbKE0NEkeFJMzYblqO1Wn56iDVz7PtKlksllUtINyjPGLVkxikx8RFtjw3atEmQm5d7jm51cO2U+kPi68Z50t2tydcPtNr5pcFWQ+oGWXetQmxj1B0ppZVtSSrMbYoxU8tdc6ke0rt3Pf+v/UeMLUut/wYhYwuuLrKuOHWDUFeLLrzBoAATWExueWk8F20MpX2x2ZhNpx0zzmgNs5aHysh7++pB0erouzXMBrapiMyb+hrcOSZpzqENk9mo2p7b0uimvSxsHn6iEXcfx5DXHcRG1mHOvqg7mplp8sDkjgKn0JIO7yO+Bc0I+WvID8XDcjS2fOPzyFWWra5qdbjMhCmWwLeo/53yyCXkG9iCo4Pdeqmz9bX18FhvMT0Qus19+qIbiq4u7NMhPDgLBWeh4CwUnIWCs5BxJmWKBWaRDjhSdTOt1dRV23MOZvsaZY2FeqVERzyJMXWGMQE00S73EsqxU/btYO+62fSOqNHVTs9VEcXF/4lsbJYHsjTb4p2+sxbCMRWS5+3WI2tFjIhvU4sO0FrffSVhawLw5sniQc+lG5O3LCxTn7QqVSPV1FHqzw//gHZtQDHmST3cnR5I83WdRcId0EC0hgRX/SK0prRUEEl2C3Tqc4pbG6p5n5K2MaHCOPlr4ymjUCLosCKqEeF8F5L93aqlvrbKnKXKisxZKq+rkDIOsc5krYeuPLQu3i76B8uLzbXQyhE/iZIZRyRcNSwWbKJ+lXoAcLLHMMNGl7clro5v0BJSx9c196OPoeOUhbxFUVyWi3rA69RR2nEXJltV7M8V/x5aDm3W2LR4f1Qr2hBFa1bFE6E/vf7xx8Hr+wGJzOsdjsjCPg2uk9jr07YxONgbwqhl82cpi29/y5mEMrdfVrudMQk/t6njrkqv9QLyL0ryQG85UYeD2vUNBf/bpuZcHWuUyUbb67+1tBVq4yXOXitZNjA4+4Qt1SfVfIsikIzt4NAr56fHb6bNbh8vCMVozXiarIktU+wm5lo7n1N13HGWppCgjGunhePriwN7zh6iGaa3em8bdtdExpmZxOwlNJvXrteHvRdIlzp9X9eFKF3SFsiCC2miGVp+y253w/nDF6x48UOL7TpEQnIAaagXDO07qsQ2kt40SHrTDhyCmGmr/F00iZxIndQHZ5hLfWw/SkqfbobQOAsZGEeLB21Hg9Zg4/qIrjzQ4UmrlrzmuazN7y3Hv5O+hJFswWjNzcSWtPCIqsYvPELR59Ph6zd/amh5Nfcv8yGh6pyMj64Gl6fHA9128ObVq9ev3gzGR0AP2mL8/fCqf0xGxoTEafP2qJa3jIeur7uTqeX9O8nMEadW9285WeFUsyRXm4woSXNTZSa9Wd6J1qU36+1AK2/RolepyV3wzIuCjoMnmNTj832uWv24v2gN53M9cQlBDD9ejJFuwDSr7cdWbbsyA1+6HJwbv9u1mrUsBeKqIic+j/iNuuIp3qXT32H31MEh+mz2+E7Pz/Qj6uFjTHGy28dj/Yh6eEwTstuzRD2hH5U43ez2qHpCPfpXnGG606P/Uk+oRz/CFxKznZ5d6kfUw1cLTFJMk50el/ahAw1h+XxNiYQETVQTsdOLcoFbD7nvX1UQab0feA3Xwk4fQgc6a7+vp+/PP55G55fR388vNZTol/G7q+lDeZGvsnOuVm/qft/tzIhxIdDyIsv5QCNmjHCokVMOlbl3f229YNq0NPAlIxyiJaNyUbc9livaYkdmxCxBpBuZ24MylALWSo7fgbPCzGO4i+nrqQblvX4z3S+neBeBG8C8jT5b3sIJF/NTolQ17ytKHheyiXmtFLfIvmopLViaAH8uLDffoyic4rY+l0vv6rJ2eXiEHgeTUzA5BZNTMDn9Z5ucmumOt6Q5LmvBrSKkuM2bLgw2YINlAkSGY9CK4yynscyxTf+cC4lipmFGHrrGkjxlxnXCMKl+4c42CHC8qHRFx39FLw2A2WgEXWwUMXzZy918fw622XE/gtMVEVidXEssJHBtijlEU51OZgXcItjxEr5Mh+iEaU2pdX8QgFK2Vs8IMDBsYQHY2jlg366PDdvQVquLb9Jqe/G1bTkfboHqWDl7sL88vj2iRBPpNDVtj9lRWR02aIOQjBd6botUXeE8lfdW3Y+XGeMSU9mpv1djaA83+4XL08lVQxHvUUJNffzoYqzjSJiA5W3GSGGwt2r8Ym1ZGxvz16FGtMY+2Hn7s+ocuQcyDCN1tf/3P5/dDXTSATAG/t9/PrOGCR0Xo0YotlTai7/1W4qd0/Ny9J2hYKAn3MAc3dt3m+Hq1++BCfNdKt9DM44JlRzAOyvGbHmUcZbksRRHvnpgRsh19a0rRyemfC+dKQUzy4WPZ7bMsiMHS3XftwPh3fNch+/Rj6PqEnlcM8u3Lkp/vbLgj5Klv04u/b4hk37f7pSnJFDVYxe2wMVPN9u2hSvqLdpoM7B/qbCOEsop+S3XN40+ePyhq5lTA5LnOL4t/BA0gUr4KVFoDyl9OiHjz4mw+bc6FkrQIkJ9TX1kAWmmb4cVI4nqicb8mvS3+u7haEmEvYVKbzE5KNQbZoAw3Rjm5hCJPF5oZh5dX49PDo1bKcVL0EwSLDFJCyXhy5eXPt1aQV1nz/UnyRxhHUFUj+ZUuxi4lFDppnDp8q9zL6ohcZ6cCvXpM6D3Cythp6bwT+jcIHTO2raIKe6AnpUdHwI8J8BzAjwnwHMCPCfAcwI8J8BzAjwnwHMCPCfAcwI851uF58wIl4soqR86leI2IYvLhYkoUHhXQ2va3AcHGqiN2Ou//OXV4NX3g/2r9PYvHOnBeC6aQtKrgReSCnZ+R2GprwgMS0yqpmlX0k1vTdnUkif8zU/9b9qHoYUcTd8ETsh19rEQQp34C5IkKTR7Wy3v7q9p12ePd9MUl8KHGN0wJAhozDeZTbu0e2rYr2ANcZpL3Ij/VCnuHuqi2b676yK3dar0Wlq0BH7bptRraPCc5Tvo7oLuLujugu4u6O6C7i7o7oLu7g/V3fnsrE2GuFHVHFgdctueFEWeVx30mAh/dgQtZNBCBi1k0EL+e2khRT6fky/VA8cVbRFpdZO+Bh1/qasNfFF3FyX+gsYn5fR6LkRRLc6udUtRvFGvBDWTWVbL7yLNAqd6p2+XrOstXkKNqu6YnC5ulMeG1eVGA+Ntyo7mlrPj8HecpiBrkTcDXD3A1QNc/dHg6l/H/9ak4C1yr6kyqUrM2VhNwbL3A8+FOo9ynoo2OaRaXRZDqjV1XLQAaXx2bSj168sPooBIW6RvKTnsYIYFJI+Q+alT6YlpDKnqflXlWS5uTtD15Qe0XgCHwlRZC35v0u8twMBFAZkXVqMslsDT5fy4Ls+OG4SXL3sTN2XOaWMsKsX7GAucqYmHP3Iw9p4lVFZN1yY4o4twbWO8Kxm0rlJ9YGhuG5G/JS71VS1L8xorvjaOQYh5nqYbF8x/x1jdZsq6PmiyI7hGjTzjO31qjkl6L8psIABkHthjSO27d1CpG1tztoquhK3bQxy48P7OfbyigkejyigkPiOLTWdVigaqGUaaoPWCoXmezklaP4GU+GZyEuqG8AXivIjnrv3WhQky+vLltNyN6cuXLoufYdWEa2XSb5TqW1j0rwi54LNU17P2NXNbb0lo7Qg0TQ4NM/cQG+C26LchG27r5jFjHtnRbg5PUVGMTlHWaiUg1t3JNkN4xvLqbrDpcx+dn7ghcxmtOc4q3S+XNglQtUjVojlAK8qlrM73SnKbCHjrvTGBFVDnWzeDObPXtMsLnDFyV9qGqx2br1k1BfE9P/dIJ3VnhBZME+36U8+qXatozpZrECZLdfnpqaEIFTlX3HYtV0pR2pxTXxsmtTKp3rLaObM9p3tsRfpsR/iEGe1NyeGQV9qrtc6NtdVunzbkWoYd+fSOWZHPJJM4rdlYfGHL1NpKl6DPkUIkLIXPfOCkOjeVBvCi2xway3VmOrtRq+DlS+7dz8Mu78vMUzfvtJsK8ZcwIz2pqpo7sXsbVvagmoqbIldnhjcALpWuzRPzTmMudY6YQ8TBpns14r59iyzpHgBca/dSF9rBvTCsiX3GC+tWMgjJljUVgy26K8eRz3qj0xw915DVnq6VUtTQmgKgXN6i0Ml5vMACUKlhbwLHipEYopaAf42qNtFDN7GAQL1ndKQYc9U9SopJdZlGKREtWrRyVYmMUmm31lLf0eYswBzQDBQb5+Zlj4l41Hfaey4avRb76/EjhIl9OorAp7251TxVNjZ6giJqA6LZCczU5GjHjqfi0aZ9Aqp4FlvS0fuYCelnQSCpLkV3B6Y4hr46/luOqax71JQKO7rvWtgYqTNAGK0XLIV+kfLiNq+KT/r/Nusii2/RLYCWjHNKJHox+dv1QUWEGj4t9l+Ps5YBnuBerZu4t9m2JTO0lKNWodEKk1T71pRzPXqvnpJ9bkGEZPwRMGrBSy54yQUvueAlF7zkgpdc8JILXnLBSy54yQUvueAlF7zkgpfcfRHOTghscWhq1m2RD635WfPshisvlNdFQPHrycUEXWAeQ9ozbCTS7ESbhr6rxRZiG6wJkQLFmDKq7ltEdLQybBGJhl9R1BugbuKsa4qf+fH7u65T3ejAfkx/PMV0iE6pIlIg5yejbW1igblVRPzf//1/BFLSDI4dW2uue6t08QYerQcuvMiQkQqovuwrT7snjJ5jvWBqR2IhWEw0RNlmIavqPpbkZqG1azqkv7podaR3lJD5HPSHNROqJbbWiZgi4w/CaPFxTZv9AKOWov6yOjEJkWSRtnTW+PVqTXUFnWdmQQzRSEnBXm9UsByWBzGmUy34KgavhKLvSy6RZL5pOIFUijsVZQKod95B+hES2+xb/fReC+ONzpdL2/tuF5jbT0go4dDD79ljWuPcemmJKwaNoGLdHrSgNyWHGIhzrTFLSV0rFfC/Ho3HV+HtEu+vEuev9VjRJDYd4fTNiikyOS/0nWt9bsC72xj/heonlk7tX/sU1vnSCF9CgupOh93fFFjd68VXYiVEEcVIbwUvvL3X9zPgQl8ljDf7shWqcMY6aKwN4lNAFbmdV3eJr5Z3BdPzbmI2+6BfMY+xVyObeENxRjjBEnds3rZ2td3c1qRJo2000Boc13K/dN69nWcc06QpYVeKu337/cJ9BE29G0OnTKobnWvVJbNzrabjYH0uKixfD8aP/ZkYOuLDOqYzgRWkqmtlX+ydzBClaL1qoJwmvideZacUm4QO3Ci0ahd//L7GZ99f2fjj94M3r16/ev16MO4vwejDL9gKM98TCKGRYUiHy2CZ84bsCLVRNGjG2ijquh38bJtCKt0jR333TsZpytaQRFsCh3Q2uSuASDtJJjOYgfF5rz6cZenGSRwtITUaIUl28kW+Prs8nVxdjo+vTk9a3HY/Op7ad2eBV4AwyjhoKTAGxX4v2Fp1b4PWmEornArJlgYTl+HNbl7E47PJ1ejsKnp3fXYyPvslmpxfXx6fbuue1ZKLAs3qO5DhjVOXU50JVbVX3LU6KQTLeVxJm1Ye4cKTfYZTTGMYolGaFrFMtMhucm1re6d+d7oZovdsDSt1Ovmmul+2lwijJaY5ThGHFYG1fs8S81tIVB8y0H0rqLMcr/Zds476YLuvdcHYa3NL7sNqrjYgfYLuHWfg48fTk/Ho6jS6GP2jZeAvLNVCO5sWgWGWS0gUt6oGYUQ3vkNl8kWDfiIc+b25g98rYpAFE0ZaEqmeYvWqLaBWY2O2qhimQ0Sjcdn2/2jSabfRxe7dOsNeq+jSglyVpO2Bz/hXZt8d7Tkl+ybKCvYRB7N5W0OeNJtUkqo3ap+AO//+nOzLgStarrVadek2q9W0WKvLLfYPKArhAUJ4gBAeILjPhPAAwW81hAcI4QFCeIAQHiAcsyE8QAgPEMIDhPAAITxACA9g9Qk6CmgkSc2eWy1vsUW7UJGqBVovwABnqlqdNRYuzGhbBk//+INTee73KJsv593qhmplKdtjpbw5UO84zhP0EVN8A/oOfkdStR5evPv47sBrIrzvOc6ylFR2WlnpLfJUXXnIB0Y/RAnQjUbaOkW+MwB5hw/V3r+Ig8gYFWB4dqvr93CnBRYINKYwQe8+vnN+Vxlnc5ICEiAloTcGS1QAvNFc0zjXhAk965KTmxvgkJSBe0wUrzAHxlJtxJJD5SESAOhzx5gJNMmXS8w9ijpOsRAkPpov52Vl1uAmJwkcvfv4zrb/esf2z4/m025G7Q8IV2E+XFfbl0s7O7tjZsoHO3zZzjQA19Xyzm7qDBK9dPT+Pv+2a3uDv9znjK9Nccfcjk+8o1z5EN/zakwJvY1Kiz0ywYFbnf1uRd3Z73a7gcUKBd7A8vn96Or0fDRB+lF3auCMHLEV8BWB9dF3CyyBYTHQTQ4eP9bHgsO8qkk0BS0ezdbciqRivnTM/CG6YmiJb8HKQIbMGKfpoWo+UzKQOdC1nGdRk0Sgz9eXY3QFy0w9MTDnrYTkziv3xx9+enWgh88c2BmHgTVTE3pz6LgvA93+r+khmr6wHgzTg2kZOqINfVNF69Q5rN3CBrkJUrQy6m86PRkaBGmGwNDoYIsinwk10zYwdV8piZuYjS0YjfdXVxduGrzfneyYvN5stfWA/u2s/2c1/KaDiotTx+idC+WHv/z5z543+/7AcecC+AqEhkNQZ9XFenrNROcUL2fkJme5SDf2EpxZ2LKAJaaSxMKdS2YZak/ED+oNl7aHoobMwtR4TpjMyiaVi3p24Eiq/zv8osg46DF/EAcqHdSnhmmqVW07qD24idrhrsOA1Fab7SPq0v2TYBvwUsOttVqxBdOk3U8f/x7qpMBw0REHLGqcXKOqSsWJknljnVJBH3amWRF1oAy2KU+RBt4M0flMMA2u0cELpuZpjfCcajgQ4H1Poj3HGY+cUNAWEKilTTk6UEt1y+S6ZgXCw8sh2sZsDgO3/c3uz2dLImWRBKYRQMYLndMqZk5fMFMDvopizJNpDwC/ZEViaCJ1q+XNkfGSl2noAXDMQbQSiFMNBJlr/UqccwNL3VNinHvuCrwSLbQVhS13yMhiTD8B994/aLIREpboxejT5OAO9LFLA+UrqyKfYuJGnyaXdhkdWxhyZVn1FQlmtWqBaBeFLYNz/OnTo5AvzPj+EaMAMYn8nq2ikWs19zofqookR1BvjJL5XHNa6zWdjiguCEf9qCsFbbgBClzzgN770Q/Ec4FEBrHaOV8xmw+WZ1cZrspetuBeU/eJCO1aBByNcrkAxcPZ7a+ErhjQi08Xo8mBC03SG9fFmTQMagQpuSEzktajS3U2aRJu4hCxORKQpqAkI/cosrpvf+tXcNk72egeBsQ+/TD+Zfz2w1aUszGQSZOYa7axnXgu0MSQc1GQc8FSEhv7/jX1bnXaL81il2mCxurcOWMSXRrPwx3zSl2MLq/Gow8f/hE9XucbXURdFBlZ1+pmjU5y2r40tA5quisk/Z40UiZLdOY0sWaELiqfhN1vyzjdY6tFd8ZS2HG7VcMelVjG1s9PK1bjqZunqVop0+Yane64nW0UNn5Unh//r+mqMIp1jmZMLrwkZJxD0EodB+KO9zzozBhfnX6Mzs6vosvT49Pxp9OTbRvRLEDvtGAXKL7BSlBBcYrJ0jCsJrCuWsf8QcfC9dno+ur9+eX4f5yeRBejf3w8PbvaS8fy8rb3zPRT2D8lwa/GeZTLm/tjN3Gzt4hMQDLZdA0oFbdRoqvR+MQzS9Xwhl4g9JmTX/840MZWRPMlcBL73Tc+8QG1bWZd7g4ENUg63y/KRX/BYx7mL1FT+xTuIJWp1QFhbSBEbrhGZ14nosZR9x9QYpegVtW+9rlkTRLEpj28Wv4V9vAUqxWn3/ZNGMU7RQSckiTKqaz5nlbLHzhQ8CUjHMTTHZ+yvHGMM5lzaMsp7CrKCYVdWYvBx9TV/ID+vR1jvvF4+cEzJnjGBM+Y4BkTPGOCZ0zwjAlnavCMCcds8IwJuzx4xgTPmOAZEzxjnMrWqna+ZYXfrijyFm1WSMTZTsiMsRRwS4AdIiIdhTtqUyW2VFapGdOExFjqKEKg0zlIhjikgIU2KSIOS0yoYhYXOt2rOnQC3j/g/QPeP+D9A94/4P17AStUoN/qqto08keY2JTEx7M0iQ1XwPujdBfrteN8LLL/QXgcS2kLxqX8hWJIdsPV+HP2jvcvsEAij9XxP8/TdFMc0Lt9zwg0d35ujQUy33EP7PaZDHNJcJpuoh0+6B964EcToKT1Q1bDtNA5XzSKX98I9jpthuztUzdRMpbWJeGiRw3TTrOuZfE7e6piCkqKKtxvxOX/cBPxFtRGDnW8Rt4BwjEWXzR2ikR9SRtUOiQ+Cu28Ks07SV6o3YglK1IGfe4a0O2pj8aT80g99d0olmRlkPfiYNiTFmDPeCAXKPYbggKVR8mFKG7LttPMtNM6MI00uSH2azi+AsIlIFwCwiWYXgPCJSBcAsIlIFwCwiUgXALCJSBcwowEhEtYE99I7NeKbiuEfQ1hX0PY1xD2NYR9/WbCvjY08wEKFqBgAQoWoGABChagYI8Y+rXc6XIY2BDxtbe56ysyHqEI5nOI24N1fdsBym6Jko52p7rHEGXeVlNVDYshOm/EHBNgo42hGFM0Ax84KYQV+08NK/a1SF10ugIqc5ymG6enxxwvQUlGa6L9UbIUx5alrB6+06LtvVb0NxjNqwjfRRTbJFhMNJtYsPJGYKrdHHYQCEXTGHMZqUt/+gRR0U3g1+Pho823SnpINMsloqwaZkocWRywQGvggJY4Ab+rvUS829FS7P+tXVtgYaZtBkBR8dAQnbEKOnkffbLvu7tHSvwCLKRW8nmMOSVSL8T9QszNV4koZF2sxb47aTf7of65ujNc46tIgFRSWP3Bq8vrtiP/jBktZdeCsZdirYtqj+4+PytGkjvGSQ2HafY4Xev5Ngqo2rKsaIxhrbeLKa/cK6ao7aZWVSFgXIDTBjhtgNMGOG3AeQU4bYDTBjhtgNMGOG2A0wY4bYDThhkJcNqwJh4PTmsUcHVTQKV4myFA4LRqTJmBupZ9VIqeshnuGxSstVLfGCR432hPr5sr0J7W7LHMhUQzQILQmxQGs40ajTRbYJfJpgSkeppx/ixtFZN2y4Hz0x9AyV7iAJokO/Gt2os+nVCARgZoZIBGBmhkgEYGaOQ9sTctsJttiBvP4dc7/kcwhYo1rfO1RdnTZ2p3wakYCFOFuRkGq3j/VnG1ctpXYmMZts9jfeWFOFPBMB4M48EwHgzjwWITDOPBMB4M48EwHgzjwTAeDOPBMB5mJBjGw5p4JMP4jKRajME3HHRgn7oqsaPBNr2ifQT5R6wvHBbI+96pWYcvEOcSmtkWerKmp4BVTYs9vVZzb7WevW7heAHxbV07DF8y45wqGdJf+Jat7XvNwCdw+gTS7z041BB8iReY3kDE65rsek1zPFwLpFpYXqe2G2pO6ISimDMhBl6nlwtAMRYmlxwHhIvoYWorCoTRLN8AN2HHKKODjJMl5ptCLWg+jKVpGIK4hSBuIYhbCOIWgrjtFY1Vt3rtdwwDTinglAJOKeCUAk7p6eKU7jzEL+3avbT4ENEdzG3B0sQG4BGtQd1qDbYd7rqNWTcuMyJLE2G3U0wyogZDw23QBGSFyXVDpZ7QAJ1c6OhX708/nEwf/9Rvofau0bgT2vWoY/CYi79EqulF91D4+rahKFNr6emMhVZqo2leQJpMv93Ahv0HsLK3PuOREyJbA+M121Ti4TWrW+BMrpniNFYkgaSQWzXWpxpGzNwV+WxJFEfj8+vXR6gUFc+Nur6dNTsyjTkkREYx5l+/Ku4+DXCyIjE0Q6lVy5sj4yV101Cd+wu2VmyFxnGAyxJrQslxiHOuOtB3TDO8Ei20FYUtHMcoSTgIgT4BJ3MSG8ZjshESlujF6NPkoLjiE1hBqvo0zPAmw+kwZsujNcxwlomisqoiUCz/6NPk0i6jY4MYqy6rvlSSq1VzcEqFLYNz/OnTo5AvzPj+EaMAMYn8nq0qI2s19zofKoGsPEG9sdXmc22hEas1TVrsmU2VQJbqmI+V2fDmI4FugALXXNecs6VTzJmBeC5cVt34K2bz4SmBM1y9wm3BvabuExFYDQNwNMrlAhTHb7e/EtFjQC8+XYwmB+6C741N2WtEW39yl4K6mii3d4R2fTKBKh8r6G3byKjGD4h52xnvdn9hbnsaaxvQM8opkVFniNCtzbbJjWW2UvNSMePm3HCGbiK+Tg/Yb5jZ0X6DzD6h4LAxkEw2Q8OWilsFI1WNxiel66OwAXkPVB8p1sVl1pTeaMBSLoDrpUASdSLPN2UBcs/Ul5wF2uhfqYKoxSOirbZFi+qMh5gmZbAW3ufaDm4SD2UdcJpX97kraXGNMF4PaOzAdFrwM3wPJG5Rs3kV0eLQLAIyzLFk3F8nn7sG1LHaQIdrcksySIhRKKr/jsaT80g99d0olmRleDuxFxv+r/v2Q6v7L5lwyXud2O7NW/pwwy+hWRc2bti4/9YbN7hm/nq/A47NpTcQs2rMjWZdy6HH5hIVbRQPkwsN5DPwUMPcznPD95lB9Hht06nnogTnvNFQMc0smZFfWsQnTlO2hsQ2PdR1o4sxkjynMZZumes39ia17nmVOZ5RLbJvwfX32TGjEqh0zplZllptwtG/jEnlvZTZR2O2/fnZxfnk6tnhswssF89+fna0en3kGPyjwgA3uSWZ/+ipRUdOtDLiWAkjP7959fp//X//DwAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Creates a sale, an authorized payment to be captured later, or an order. To create a sale, authorization, or order, include the payment details in the JSON request body. Set the `intent` to `sale`, `authorize`, or `order`. <blockquote><strong>Note: </strong>TPP Clients (Third Party Providers in the context of PSD2 regulation) are restricted from using <code>authorize</code> and <code>order</code> intents.</blockquote> Include payer, transaction details, and, for PayPal payments only, redirect URLs. The combination of the `payment_method` and `funding_instrument` determines the type of payment that is created. For more information, see [Payments REST API](/docs/integration/direct/payments/).<blockquote><strong>Note:</strong> Authorizations are guaranteed for up to three days, though you can attempt to capture an authorization for up to 29 days. After the three-day honor period authorization expires, you can [reauthorize](#authorization_reauthorize) the payment.</blockquote>
 */
public class PaymentCreateRequest extends HttpRequest<Payment> {

    public PaymentCreateRequest() {
        super("/v1/payments/payment?", "POST", Payment.class);
        
        header("Content-Type", "application/json");
    }
    public PaymentCreateRequest payPalPartnerAttributionId(String payPalPartnerAttributionId) {
        header("PayPal-Partner-Attribution-Id", String.valueOf(payPalPartnerAttributionId));
        return this;
    }
    
    

    public PaymentCreateRequest requestBody(Payment payment) {
        super.requestBody(payment);
        return this;
    }
}
